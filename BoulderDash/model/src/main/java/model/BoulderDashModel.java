package model;

import java.io.IOException;

import mobile.Player;

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
	 * @param road
	 *            the road to set
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
	 * @param myVehicle
	 *            the myVehicle to set
	 */
	private void setPlayer(final IMobile palyer) {
		this.player = this.player;
	}
}
//
// Lol