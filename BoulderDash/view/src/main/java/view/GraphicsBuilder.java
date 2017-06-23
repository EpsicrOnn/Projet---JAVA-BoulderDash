package view;

import java.awt.Graphics;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import gameframe.IGraphicsBuilder;
import model.IBoulderDashModel;
import model.IMobile;
import model.IMap;

/**
 * <h1>The Class GraphicsBuilder</h1>
 *
 * @author Vincent VALLET
 * @about This class will take care about the graphics of the game.
 */
public class GraphicsBuilder implements IGraphicsBuilder {

	/** The boulderdash model. */
	private final IBoulderDashModel boulderdashModel;
	private final IMap Map;

	/**
	 * Instantiates a new graphics builder.
	 *
	 * @param boulderdashModel
	 *            the boulderdash model
	 */
	public GraphicsBuilder(final IBoulderDashModel boulderdashModel) {
		this.boulderdashModel = boulderdashModel;
	}

	@Override
	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
		for (final IMobile mobile : this.boulderdashModel.Mobile()) {
			this.drawMobile(mobile, graphics, observer);
		}
	}

	@Override
	public int getGlobalWidth() {
		return this.Map.getWidth();
	}

	@Override
	public int getGlobalHeight() {
		return this.Map.getHeight();
	}

}
