package view;

import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.EventPerformer;
import view.GraphicsBuilder;
import gameframe.GameFrame;

public class BoulderDashView implements IViewSystem, Runnable {
	private final GraphicsBuilder	graphicsBuilder;
	private final EventPerformer	eventPerformer;
	private final Observable		observable;
	private GameFrame				gameFrame;

	public BoulderDashView(final IOrderPerformer orderPerformer, final IBoulderDashModel boulderdashModel, final Observable observable) {
		this.observable = observable;
		this.graphicsBuilder = new GraphicsBuilder(boulderdashModel);
		this.eventPerformer = new EventPerformer(orderPerformer);
		SwingUtilities.invokeLater(this);
	}
	
	public void run() {
		this.gameFrame = new GameFrame("BoulderDash", this.eventPerformer, this.graphicsBuilder, this.observable);
	}
	
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void closeAll() {
		this.gameFrame.dispose();
	}
}
