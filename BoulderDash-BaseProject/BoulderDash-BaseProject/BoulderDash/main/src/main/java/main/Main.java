package main;

import java.util.Map;

import controller.BDControlleur;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		final BDControlleur controller = new BDControlleur(new ViewFacade(), new ModelFacade());
		final Map map = new Map();

		map.loadFile("map1.txt");
		controller.play();
	}

}
