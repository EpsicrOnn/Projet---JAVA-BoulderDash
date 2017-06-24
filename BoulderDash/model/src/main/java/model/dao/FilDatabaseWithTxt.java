package model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class FillDatabaseWithTxt.
 */
public class FilDatabaseWithTxt {

	private int width;

	private int height;

	/** The idlevel. */
	private final int idlevel;

	/** The file name. */
	private final String fileName;

	/** The level name. */
	private final String levelName;

	/** The dao. */
	private final BddInsertion dao;

	/** The query. */
	String query;

	/**
	 * Instantiates a new fill database with txt.
	 *
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 * @param idlevel
	 *            the idlevel
	 * @param fileName
	 *            the file name
	 * @param levelname2
	 *            the level name
	 * @param dao1
	 *            the dao
	 */
	public FilDatabaseWithTxt(final int idlevel, final String fileName, final String levelname2,
			final BddInsertion dao1) {
		this.idlevel = idlevel;
		this.fileName = fileName;
		this.levelName = levelname2;
		this.dao = dao1;

	}

	/**
	 * The on the road.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void loadFile() throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName)));
		String line;
		int y = 0;
		line = buffer.readLine();
		this.setWidth(Integer.parseInt(line));
		line = buffer.readLine();
		this.setHeight(Integer.parseInt(line));
		this.dao.executeUpdate(
				"INSERT INTO `map` (`ID_Map`, `Level_Name`, `Width`, `Height`) VALUES ('" + this.getIdlevel() + "', '"
						+ this.getLevelName() + "', '" + this.getWidth() + "', '" + this.getHeight() + "');");
		line = buffer.readLine();
		while (line != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				this.dao.executeUpdate("INSERT INTO `object` (`ID`, `X`, `Y`, `ID_Map`, `Numero`) VALUES (NULL, '" + x
						+ "', '" + y + "', '" + this.getIdlevel() + "', '" + line.toCharArray()[x] + "');");
			}
			line = buffer.readLine();
			y++;
		}
		buffer.close();
	}

	/**
	 * Gets the idlevel.
	 *
	 * @return the idlevel
	 */
	public int getIdlevel() {
		return this.idlevel;
	}

	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * Gets the level name.
	 *
	 * @return the level name
	 */
	public String getLevelName() {
		return this.levelName;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(final int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(final int height) {
		this.height = height;
	}

}
