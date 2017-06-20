package gameframe;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;

import jpu2016.gameframe.GamePanel;

public class GameFrame extends JFrame implements KeyListener {
	private final IEventPerformer keyEvent;
	
	public GameFrame(final String title, final IEventPerformer performer, final IGraphicsBuilder graphicBuilder, final Observable observable) {
		throws HeadlessException {
	this.eventPerformer = eventPerformer;

	this.setTitle(title);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.addKeyListener(this);
	this.setVisible(true);

	final GamePanel gamePanel = new GamePanel(graphicsBuilder);
	this.setContentPane(gamePanel);
	this.setSize(graphicsBuilder.getGlobalWidth() + this.getInsets().left + this.getInsets().right,
			graphicsBuilder.getGlobalHeight() + this.getInsets().top + this.getInsets().bottom);
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

}
