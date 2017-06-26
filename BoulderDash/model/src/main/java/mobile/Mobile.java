package mobile;

import java.awt.Point;

import model.Collision;
import model.Element;
import model.IMap;
import model.IMobile;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Mobile.
 */
public abstract class Mobile extends Element implements IMobile {

	/** The direction. */
	private Direction direction;
	
	/** The position. */
	private Point position;
	
	/** The alive. */
	static Boolean alive = true;
	
	/** The map. */
	protected IMap map;

	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	Mobile(Sprite sprite, Collision collision) {
		super(sprite, collision);
	}

	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite the sprite
	 * @param map the map
	 * @param collision the collision
	 */
	Mobile(Sprite sprite, IMap map, Collision collision) {
		super(sprite, collision);
		this.setMap(map);
		this.position = new Point();
	}

	/**
	 * Instantiates a new mobile.
	 *
	 * @param x the x
	 * @param y the y
	 * @param sprite the sprite
	 * @param map the map
	 * @param collision the collision
	 */
	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Collision collision) {
		this(sprite, map, collision);
		this.setX(x);
		this.setY(y);
	}

	/**
	 * Move.
	 */
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

	/* (non-Javadoc)
	 * @see model.IMobile#moveUp()
	 */
	@Override
	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#moveLeft()
	 */
	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#moveDown()
	 */
	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setHasMoved();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#moveRight()
	 */
	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#doNothing()
	 */
	@Override
	public void doNothing() {
		this.setHasMoved();
	}

	/**
	 * Sets the has moved.
	 */
	private void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#getX()
	 */
	@Override
	public final int getX() {
		return this.getPosition().x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public final void setX(final int x) {
		this.getPosition().x = x;
		if (this.isKilled()) {
			this.die();
		}
	}

	/* (non-Javadoc)
	 * @see model.IMobile#getY()
	 */
	@Override
	public final int getY() {
		return this.getPosition().y;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public final void setY(final int y) {
		this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
		if (this.isKilled()) {
			this.die();
		}
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public IMap getMap() {
		return this.map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map the new map
	 */
	private void setMap(final IMap map) {
		this.map = map;
	}

	/* (non-Javadoc)
	 * @see model.IMobile#isAlive()
	 */
	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	/**
	 * Die.
	 */
	protected void die() {
		this.alive = false;
		this.setHasMoved();
	}

	/* (non-Javadoc)
	 * @see model.IMobile#isKilled()
	 */
	@Override
	public Boolean isKilled() {
		return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getCollision() == Collision.KILLING;
	}

	/* (non-Javadoc)
	 * @see model.IMobile#getPosition()
	 */
	@Override
	public Point getPosition() {
		return this.position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	public void setPosition(final Point position) {
		this.position = position;
	}

}
//