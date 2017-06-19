package fr.boulderdash.model.mobile;

import java.awt.Point;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Element;
import fr.boulderdash.model.IMap;
import fr.boulderdash.model.Sprite;

public abstract class Mobile extends Element implements IMobile {

	private final Point position;
	private final Boolean alive = true;
	private IMap map;
	private IBoard board;

	Mobile(final Sprite sprite, final IMap map, final Collision collision) {
		super(sprite, collision);
		this.setMap(map);
		this.position = new Point();
	}

	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Collision collision) {
		this(sprite, map, collision);
		this.setX(x);
		this.setY(y);
	}

	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
	}

	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setHasMoved();
	}

	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}

	public void doNothing() {
		this.setHasMoved();
	}

	private void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

	public final int getX() {
		return this.getPosition().x;
	}

	public final void setX(final int x) {
		this.getPosition().x = x;
		if (this.isCrashed()) {
			this.die();
		}
	}

	public final int getY() {
		return this.getPosition().y;
	}

	public final void setY(final int y) {
		this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
		if (this.isCrashed()) {
			this.die();
		}
	}

	public IMap getMap() {
		return this.map;
	}

	private void setRoad(final IMap map) {
		this.map = map;
	}

	public Boolean isAlive() {
		return this.alive;
	}

	protected void die() {
		this.alive = false;
		this.setHasMoved();
	}

	public Boolean isCrashed() {
		return this.getMap().getOnTheRoadXY(this.getX(), this.getY()).getCollision() == Collision.BLOCKING;
	}

	public Point getPosition() {
		return this.position;
	}

	public void setPosition(final Point position) {
		this.position = position;
	}

	protected IBoard getBoard() {
		return this.board;
	}

}
