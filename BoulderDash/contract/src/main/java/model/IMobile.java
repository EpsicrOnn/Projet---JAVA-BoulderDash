package model;

import java.awt.Point;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMobile.
 */
public interface IMobile {

	/**
	 * Move up.
	 */
	void moveUp();

	/**
	 * Move left.
	 */
	void moveLeft();

	/**
	 * Move down.
	 */
	void moveDown();

	/**
	 * Move right.
	 */
	void moveRight();

	/**
	 * Do nothing.
	 */
	void doNothing();

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	int getX();

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	int getY();

	/**
	 * Checks if is alive.
	 *
	 * @return the boolean
	 */
	Boolean isAlive();

	/**
	 * Checks if is killed.
	 *
	 * @return the boolean
	 */
	Boolean isKilled();

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	Point getPosition();
}
