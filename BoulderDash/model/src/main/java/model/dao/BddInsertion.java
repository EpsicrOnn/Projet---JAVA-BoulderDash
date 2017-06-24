package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class BddInsertion {

	/** The url. */
	private static String URL = "jdbc:mysql://localhost/boulderdashr?autoReconnect=true&useSSL=false";

	/** The login. */
	private static String LOGIN = "root";

	/** The password. */
	private static String PASSWORD = "";

	/** The connection. */
	private Connection connection;

	/** The statement. */
	private Statement statement;

	/**
	 * Instantiates a new dao.
	 */
	public BddInsertion() {
		this.connection = null;
		this.statement = null;
	}

	/**
	 * Open.
	 *
	 * @return true, if successful
	 */
	public boolean open() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(BddInsertion.URL, BddInsertion.LOGIN, BddInsertion.PASSWORD);
			this.statement = this.connection.createStatement();
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Close.
	 */
	public void close() {
		try {
			this.connection.close();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Execute update.
	 *
	 * @param query
	 *            the query
	 * @return the int
	 */
	public int executeUpdate(final String query) {
		try {
			return this.statement.executeUpdate(query);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
