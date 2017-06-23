package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * <h1>The Interface IGraphicsBuilder</h1>
 * @author Vincent VALLET
 * @about This interface will gather all the method of GraphicsBuilder.
 */
public interface IGraphicsBuilder {

	/**
	 * Apply model to graphic.
	 *
	 * @param graphics the graphics
	 * @param observer the observer
	 */
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer);
	
	/**
	 * Gets the global width.
	 *
	 * @return the global width
	 */
	public int getGlobalWidth();
	
	/**
	 * Gets the global height.
	 *
	 * @return the global height
	 */
	public int getGlobalHeight();

}
