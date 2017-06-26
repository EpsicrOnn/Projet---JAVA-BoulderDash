package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import model.dao.DAO;

public class Map extends Observable implements IMap {

	private int width;
	private int height;
	private int levelID;
	private IElement onTheMap[][];
	private ArrayList<IMobile> mobiles;
	private int diamondCounter;
	private IMobile miner;
	private IMobile mobile;

	public Map(final int levelID) {
		this.mobiles = new ArrayList<IMobile>();
		this.setLevelID(levelID);
		try {
			this.loadLevel();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	public int getLevelID() {
		return this.levelID;
	}

	@Override
	public IMobile getMobileXY(final int x, final int y) {
		return this.mobile;
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	@Override
	public IElement getOnTheMapXY(final int x, final int y) {
		return this.onTheMap[y][x];
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	public void loadLevel() throws SQLException {
		final MapTab gamingMap = DAO.getLevelByID(this.levelID);
		final int consoleMapTable[][] = new int[gamingMap.getHeight()][gamingMap.getWidth()];
		this.setHeight(gamingMap.getHeight());
		this.setWidth(gamingMap.getWidth());
		this.onTheMap = new IElement[this.getHeight()][this.getWidth()];
		final List<FillingTab> objects = DAO.getMapFilledByID(gamingMap.getLevelID());
		for (final FillingTab fillingMap : objects) {
			consoleMapTable[fillingMap.getY()][fillingMap.getX()] = fillingMap.getObjectType();
		}
	}

	@Override
	public void setDiamondCounter(final int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	private void setHeight(final int height) {
		this.height = height;
	}

	public void setLevelID(final int levelID) {
		this.levelID = levelID;
	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onTheMap[y][x] = element;
		// met l'élément dans le tableau de Map [x][y]
	}

	private void setWidth(final int width) {
		this.width = width;
	}

	@Override
	public IMobile getPlayer() {
		return this.getPlayer();
	}

	public void setMiner(final IMobile miner) {
		this.miner = miner;
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	public void setMobiles(final ArrayList<IMobile> mobiles) {
		this.mobiles = mobiles;
	}

}
