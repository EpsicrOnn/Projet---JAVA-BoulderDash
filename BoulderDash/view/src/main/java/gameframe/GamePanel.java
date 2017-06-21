package gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

import gameframe.IGraphicsBuilder;

public class GamePanel extends JPanel implements Observer {
	private static final long serialVersionUID = 1L;
	private final IGraphicsBuilder	graphicsBuilder;

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