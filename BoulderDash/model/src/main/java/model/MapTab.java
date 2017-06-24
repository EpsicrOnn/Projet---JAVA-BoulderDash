package model;

// TODO: Auto-generated Javadoc
/**
 * The Class MapTab.
 */
public class MapTab {
	
	/** The level ID. */
	private int levelID;
	
	/** The height. */
	public int height;
	
	/** The width. */
	public int width;
	
	/** The diamond counter. */
	public int diamondCounter;

	/**
	 * Instantiates a new map tab.
	 *
	 * @param levelID the level ID
	 * @param height the height
	 * @param width the width
	 * @param diamondCounter the diamond counter
	 */
	public MapTab(final int levelID, final int height, final int width, final int diamondCounter) {
		this.setLevelID(levelID);
		this.height = height;
		this.width = width;
		this.setDiamondCounter(diamondCounter);
	}

	/**
	 * Gets the diamond counter.
	 *
	 * @return the diamond counter
	 */
	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Gets the level ID.
	 *
	 * @return the level ID
	 */
	public int getLevelID() {
		return this.levelID;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Sets the diamond counter.
	 *
	 * @param diamondCounter the new diamond counter
	 */
	public void setDiamondCounter(int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Sets the level ID.
	 *
	 * @param levelID the new level ID
	 */
	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

}