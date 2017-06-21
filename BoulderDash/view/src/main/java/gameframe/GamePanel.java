package gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import gameframe.IGraphicsBuilder;

/**
 * <h1>The Class GamePanel</h1>
 * @author Vincent VALLET
 * @about This class will contain the Frame and other.
 *
 */
public class GamePanel extends JPanel implements Observer {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The graphics builder. */
	private final IGraphicsBuilder	graphicsBuilder;

	/**
	 * Instantiates a new game panel.
	 *
	 * @param graphicBuilder the graphic builder
	 */
	public GamePanel(final IGraphicsBuilder graphicBuilder){
		this.graphicsBuilder = graphicBuilder;
	}
	
	public void update(Observable o, Object arg) {
		this.repaint();
	}
	
	public void paintComponent(final Graphics graphic){
		this.graphicsBuilder.applyModelToGraphic(graphic, this);
	}

}