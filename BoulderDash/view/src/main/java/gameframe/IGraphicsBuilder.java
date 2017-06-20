package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	public void applyModelToGraphic(final Graphics graphics, final ImageObserver observer);
	
	public int getGlobalWidth();
	
	public int GetGlobalHeight();
}
