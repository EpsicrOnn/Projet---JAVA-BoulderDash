package view;

import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.EventPerformer;
import view.GraphicsBuilder;
import gameframe.GameFrame;

/**
 * <h1>The Class BoulderDashView</h1>
 * @author Vincent VALLET
 * @about This class will manage the View. 
 */
public class BoulderDashView implements IBoulderDashView, Runnable {
	
	/** The graphics builder. */
	private final GraphicsBuilder	graphicsBuilder;
	
	/** The event performer. */
	private final EventPerformer	eventPerformer;
	
	/** The observable. */
	private final Observable		observable;
	
	/** The game frame. */
	private GameFrame				gameFrame;

	/**
	 * Instantiates a new boulder dash view.
	 *
	 * @param orderPerformer the order performer
	 * @param boulderdashModel the boulderdash model
	 * @param observable the observable
	 */
	public BoulderDashView(final IOrderPerformer orderPerformer, final IBoulderDashModel boulderdashModel, final Observable observable) {
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(boulderdashModel);
		this.eventPerformer = new EventPerformer(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	public void run() {
		this.gameFrame = new GameFrame("BoulderDash", this.eventPerformer, this.graphicsBuilder, this.observable);
	}
	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll() {
		this.gameFrame.dispose();
	}
}
