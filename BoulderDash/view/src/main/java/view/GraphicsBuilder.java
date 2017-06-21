package view;

import java.awt.Graphics;

import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import gameframe.IGraphicsBuilder;
import model.IBoulderDashModel;

class GraphicsBuilder implements IGraphicsBuilder {
		private final IBoulderDashModel	boulderdashModel;

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

		@Override
		public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
			// TODO Auto-generated method stub
			
		}
}
