package gameframe;

import java.awt.HeadlessException;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;
import gameframe.GamePanel;
import gameframe.IEventPerformer;
import gameframe.IGraphicsBuilder;


/**
 * <h1>The Class GameFrame</h1>
 * @author Vincent VALLET
 * @about This class will insert Panel in order to see the window of the game.
 *
 */
public class GameFrame extends JFrame implements KeyListener {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The event performer. */
	private final IEventPerformer eventPerformer;
	
	/**
	 * Instantiates a new game frame.
	 *
	 * @param title the title
	 * @param eventPerformer the event performer
	 * @param graphicBuilder the graphic builder
	 * @param observable the observable
	 * @throws HeadlessException the headless exception
	 */
	public GameFrame(final String title, final IEventPerformer eventPerformer, final IGraphicsBuilder graphicBuilder, final Observable observable) throws HeadlessException {
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

	/**
	 * Key realeased.
	 *
	 * @param keyEvent the key event
	 */
	public void keyRealeased(final KeyEvent keyEvent){
	}
	
	public void keyTyped(final KeyEvent keyEvent){

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

		
	}

}
