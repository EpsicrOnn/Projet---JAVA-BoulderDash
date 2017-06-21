package view;

import java.awt.Graphics;

import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import gameframe.IGraphicsBuilder;
import model.IBoulderDashModel;

/**
 * <h1>The Class GraphicsBuilder</h1>
 * @author Vincent VALLET
 * @about This class will take care about the graphics of the game.
 */
class GraphicsBuilder implements IGraphicsBuilder {
		
		/** The boulderdash model. */
		private final IBoulderDashModel	boulderdashModel;

		/**
		 * Instantiates a new graphics builder.
		 *
		 * @param boulderdashModel the boulderdash model
		 */
		public GraphicsBuilder(final IBoulderDashModel boulderdashModel) {
			this.boulderdashModel = boulderdashModel;
		}
		
		public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
			for (final IMobile mobile : this.boulderdashModel.getMobiles()) {
				this.drawMobile(mobile, graphics, observer);
			}
		}

		public int getGlobalWidth() {
			return this.boulderdashModel.getWidth();
		}

		public int getGlobalHeight() {
			return this.boulderdashModel.getHeight();
		}

}
