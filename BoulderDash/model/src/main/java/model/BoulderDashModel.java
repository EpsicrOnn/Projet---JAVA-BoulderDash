package model;

import java.awt.List;
import java.io.IOException;
import java.sql.SQLException;

import mobile.Player;
import model.dao.DAO;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class InsaneVehiclesModel.</h1>
 */
public class BoulderDashModel implements IBoulderDashModel {

	/** The road. */
	private IMap map;

	/** The my vehicle. */
	private IMobile player;

	/**
	 * Instantiates a new insane vehicles model.
	 *
	 * @param level the level
	 */
	  public BoulderDashModel(final int level) {
	        this.setMap(new Map(level));

	/**
	 * Instantiates a new boulder dash model.
	 *
	 * @param fileName
	 *            the file name
	 * @param myVehicleStartX
	 *            the my vehicle start X
	 * @param myVehicleStartY
	 *            the my vehicle start Y
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public BoulderDashModel(final String fileName, final int myVehicleStartX, final int myVehicleStartY)
			throws IOException {
		this.setMap(new Map(fileName));
		this.setPlayer(new Player(myVehicleStartX, myVehicleStartY, this.getMap()));
	}

	/**
	 * Gets the all positions by id.
	 *
	 * @param levelID
	 *            the level ID
	 * @return the all positions by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	public List<FillingTab> getAllPositionsById(final int levelID) throws SQLException {
		return DAO.getMapFilledByID(levelID);
	}

	/**
	 * Gets the level by ID.
	 *
	 * @param levelID
	 *            the level ID
	 * @return the level by ID
	 * @throws SQLException
	 *             the SQL exception
	 */
	public MapTab getLevelID(final int levelID) throws SQLException {
		return DAO.getLevelByID(levelID);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getRoad()
	 */
	@Override
	public final IMap getMap() {
		return this.map;
	}

	/**
	 * Sets the road.
	 *
	 * @param map
	 *            the new map
	 */
	private void setMap(final IMap map) {
		this.map = map;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see fr.exia.insanevehicles.model.IInsaneVehiclesModel#getMyVehicle()
	 */
	@Override
	public final IMobile getPlayer() {
		return this.player;
	}

	/**
	 * Sets the my vehicle.
	 *
	 * @param palyer
	 *            the new player
	 */
	private void setPlayer(final IMobile palyer) {
		this.player = this.player;
	}

	@Override
	public IMobile getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

}
//
// Lol