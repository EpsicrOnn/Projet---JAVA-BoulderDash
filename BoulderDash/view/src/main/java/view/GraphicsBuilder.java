package view;

import java.awt.Graphics;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import model.IBoulderDashMobile;

class GraphicsBuilder implements IGraphicsBuilder {
		private final IBoulderDashModel	boulderdashModel;

		public GraphicsBuilder(final IBoulderDashModel boulderdashModel) {
			this.boulderdashModel = boulderdashModel;
		}
		
		public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer) {
			for (final IMobile mobile : this.dogfightModel.getMobiles()) {
				this.drawMobile(mobile, graphics, observer);
			}
		}

		public int getGlobalWidth() {
			return this.boulderdashModel.getArea().getWidth();
		}

		public int getGlobalHeight() {
			return this.boulderdashModel.getArea().getHeight();
		}
