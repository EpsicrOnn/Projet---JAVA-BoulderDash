package gameframe;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	public GamePanel(final IGraphicsBuilder graphicBuilder){
		this.graphicBuilder = graphicBuilder;
	}
	
	public void update(Observable o, Object arg) {
		this.repaint();
	}
	
	public void paintComponent(final Graphics graphic){
		this.graphicsBuilder
	}

}