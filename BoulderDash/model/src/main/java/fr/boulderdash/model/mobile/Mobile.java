package fr.boulderdash.model.mobile;

import java.awt.Point;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Element;
import fr.boulderdash.model.IMap;
import fr.boulderdash.model.Sprite;

public abstract class Mobile extends Element implements IMobile {

	private final Direction direction;
	private Point position;
	private Boolean alive = true;
	private IMap map;

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

	public void move() {
		switch (this.direction) {
		case UP:
			this.moveUp();
			break;
		case RIGHT:
			this.moveRight();
			break;
		case DOWN:
			this.moveDown();
			break;
		case LEFT:
			this.moveLeft();
			break;
		default:
			break;
		}
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setHasMoved();
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}

	@Override
	public void doNothing() {
		this.setHasMoved();
	}

	private void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

	@Override
	public final int getX() {
		return this.getPosition().x;
	}

	public final void setX(final int x) {
		this.getPosition().x = x;
		if (this.isCrashed()) {
			this.die();
		}
	}

	@Override
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

	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	protected void die() {
		this.alive = false;
		this.setHasMoved();
	}

	@Override
	public Boolean isKilled() {
		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getCollision() == Collision.BLOCKING;
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	public void setPosition(final Point position) {
		this.position = position;
	}

}
//