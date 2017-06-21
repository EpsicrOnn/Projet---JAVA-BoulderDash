package gameframe;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;
import gameframe.GamePanel;
import gameframe.IEventPerformer;
import view.BoulderDashView;
import gameframe.IGraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	private final IEventPerformer eventPerformer;
	private final IEventPerformer keyEvent;
	
	public GameFrame(final String title, final IEventPerformer eventPerformer, final IGraphicsBuilder graphicBuilder, final Observable observable) {
		throw HeadlessException 
	this.eventPerformer = eventPerformer;

	this.setTitle(title);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.addKeyListener(this);
	this.setVisible(true);

	final GamePanel gamePanel = new GamePanel(graphicBuilder);
	this.setContentPane(gamePanel);
	this.setSize(graphicBuilder.getGlobalWidth() + this.getInsets().left + this.getInsets().right,
			     graphicBuilder.getGlobalHeight() + this.getInsets().top + this.getInsets().bottom);
	this.setLocationRelativeTo(null);
	observable.addObserver(gamePanel);

	this.setVisible(true);
		
	}
	
	public void keyPressed(final KeyEvent keyEvent) {
		this.eventPerformer.eventPerform(keyEvent);
	}

	public void keyRealeased(final KeyEvent keyEvent){
	}
	
	public void keyTyped(final KeyEvent keyEvent){

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

		
	}

}
