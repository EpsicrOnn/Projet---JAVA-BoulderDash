package model.dao;

import java.io.IOException;

/**
 * The Class Tests.
 */
public class Tests {
	/*
	 * THE FOLLOWING CONSTANTS MUST BE UPDATED FOR EACH NEW LEVEL TO SAVE,
	 * CHANGE ALSO THE CONNECTION PARAMETERS IN DAO.java
	 */

	/** The Constant idlevel. */
	private final static int idlevel = 1;

	/** The Constant fileName. */
	private final static String fileName = "map1.txt";

	private final static String levelName = "map1";

	/**
	 * The main method. s
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(final String[] args) throws IOException {
		final BddInsertion dao1 = new BddInsertion();
		System.out.println("Starting database filling...");
		final FilDatabaseWithTxt fillDB = new FilDatabaseWithTxt(Tests.idlevel, Tests.fileName, Tests.levelName, dao1);
		dao1.open();
		fillDB.loadFile();
		dao1.close();
		System.out.println("Database filled");
	}

}