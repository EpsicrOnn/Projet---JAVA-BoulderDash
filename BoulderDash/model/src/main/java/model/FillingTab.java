package model;

// TODO: Auto-generated Javadoc
/**
 * The Class FillingTab.
 */
public class FillingTab {
	
	/** The picture ID. */
	private int pictureID;
	
	/** The x. */
	public int x;
	
	/** The y. */
	public int y;
	
	/** The object type. */
	public int objectType;

	/**
	 * Instantiates a new filling tab.
	 *
	 * @param x the x
	 * @param y the y
	 * @param pictureID the picture ID
	 * @param objectType the object type
	 */
	public FillingTab(final int x, final int y, final int pictureID, final int objectType) {
		this.pictureID = pictureID;
		this.x = x;
		this.y = y;
		this.objectType = objectType;
	}

	/**
	 * Gets the object type.
	 *
	 * @return the object type
	 */
	public int getObjectType() {
		return this.objectType;
	}

	/**
	 * Gets the picture ID.
	 *
	 * @return the picture ID
	 */
	public int getPictureID() {
		return this.pictureID;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Sets the object type.
	 *
	 * @param objectType the new object type
	 */
	public void setObjectType(int objectType) {
		this.objectType = objectType;
	}

	/**
	 * Sets the picture ID.
	 *
	 * @param pictureID the new picture ID
	 */
	public void setPictureID(int pictureID) {
		this.pictureID = pictureID;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}
}