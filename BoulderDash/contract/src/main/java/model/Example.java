package model;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

	/** The id. */
	private final int id;

	/** The name. */
	private String name;
	
	/** The id. */
	private int ID;
	
	/** The x. */
	private int X;
	
	/** The y. */
	private int Y;
	
	/** The I D map. */
	private int ID_Map;
	
	/** The Numero. */
	private int Numero;

	/**
	 * Instantiates a new example.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	public Example(final int id, final String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * Instantiates a new example.
	 *
	 * @param ID the id
	 * @param X the x
	 * @param Y the y
	 * @param ID_Map the i D map
	 * @param Numero the numero
	 */
	public Example(final int ID, final int X, final int Y, final int ID_Map, final int Numero) {
		super();

		this.ID = ID;
		this.X = X;
		this.Y = Y;
		this.ID_Map = ID_Map;
		this.Numero = Numero;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getId() + " : " + this.getName();
	}
}
