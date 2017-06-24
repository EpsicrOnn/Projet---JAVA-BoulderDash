package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.BoulderDashView;
import view.IBoulderDashView;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

/*
 * POUR LANCER LE JEU : Premiere chose à faire : - Créer la BDD du nom de
 * boulderdashy avec le script sql fourni. - Allez dans Model.Dao, la classe
 * Test et faire un run dessus (afin d'ajouter la map dans la bdd). - Bien
 * penser à changer l'id et le nom de la map si on veut une differente.
 *
 * -Lancer le "vrai" main en entrant le bon LevelID.
 *
 */

public abstract class Main {

	/** The levelid. */
	private static int LEVELID = 1;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws InterruptedException
	 *             the interrupted exception
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
		final IBoulderDashModel model = new BoulderDashModel(Main.LEVELID);
		final IBoulderDashView view = new BoulderDashView(model.getMap());
		final BoulderDashController controller = new BoulderDashController(view, model);
		view.setOrderPerformer(controller.getOrderPerformer());

		controller.play();
	}

}