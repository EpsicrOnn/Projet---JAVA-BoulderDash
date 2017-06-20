package fr.boulderdash.model.mobile;

import java.awt.Point;

public interface IMobile {

	void moveUp();

	void moveLeft();

	void moveDown();

	void moveRight();

	void doNothing();

	int getX();

	int getY();

	Boolean isAlive();

	Boolean isKilled();

	Point getPosition();
}
