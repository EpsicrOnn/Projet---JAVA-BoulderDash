package model;

public class MapTab {
	private int levelID;
	public int height;
	public int width;
	public int diamondCounter;

	public MapTab(final int levelID, final int height, final int width, final int diamondCounter) {
		this.setLevelID(levelID);
		this.height = height;
		this.width = width;
		this.setDiamondCounter(diamondCounter);
	}

	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	public int getHeight() {
		return this.height;
	}

	public int getLevelID() {
		return this.levelID;
	}

	public int getWidth() {
		return this.width;
	}

	public void setDiamondCounter(int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}