package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import controller.ControllerFacade;
import fr.boulderdash.model.BoulderDashModel;
import fr.boulderdash.model.IBoulderDashModel;
import model.ModelFacade;
import view.BoulderDashView;
import view.IBoulderDashView;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	private static final int	startX	= 5;

	/** The Constant startY. */
	private static final int	startY	= 0;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) throws IOException, InterruptedException {
		final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

		final IBoulderDashModel model = new BoulderDashModel("map1.txt", startX, startY);
		final IBoulderDashView view = new BoulderDashView(model.getMap(), model.getPlayer());
		final IBoulderDashController controller = new BoulderDashController(view, model);
		view.setOrderPerformer(controller.getOrderPeformer());

		try {
			controller.start();
		} catch (final SQLException exception) {
			this.exception.printStackTrace();
		}
		controller.play();
	}
}
