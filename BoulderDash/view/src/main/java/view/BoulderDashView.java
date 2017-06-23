package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.EventPerformer;
import view.GraphicsBuilder;
import showboard.BoardFrame;

/**
 * <h1>The Class BoulderDashView</h1>
 * @author Vincent VALLET
 * @about This class will manage the View. 
 */

public class BoulderDashView implements IBoulderDashView, Runnable {
	
    /** The Constant width of the board. */
    public final int        width;

    /** The Constant height of the board. */
    public final int        height;
    
    /** The initial frame size. */
    private static final int  defaultFrameSize = 700;
	
	/** The graphics builder. */
	private final GraphicsBuilder	graphicsBuilder;
	
	/** The event performer. */
	private final EventPerformer	eventPerformer;
	
	/** The observable. */
	private final Observable		observable;
	
	/** The game frame. */
	private BoardFrame				boardFrame;
	
    /** The Constant closeView is the cadre of the board displayed in the close view frame. */
    private static final Rectangle playerView           = new Rectangle(5, 5, 9, 9);

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
		this.boardFrame = new BoardFrame("BoulderDash", this.eventPerformer, this.graphicsBuilder, this.observable);
		final BoardFrame framePlayerView = new BoardFrame("Player view");
		this.width = this.boulderdashModel.getWidth();
		this.height = this.boulderdashModel.getHeight();
        framePlayerView.setDimension(new Dimension(width, height));
        framePlayerView.setDisplayFrame(playerView);
        framePlayerView.setSize(defaultFrameSize, defaultFrameSize);
        this.frameConfigure(framePlayerView);
	}
	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll() {
		this.boardFrame.dispose();
	}
}
