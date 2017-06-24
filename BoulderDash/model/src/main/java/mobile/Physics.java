package mobile;

import model.Collision;
import model.Map;
import model.Sprite;
import motionless.EmptyDirt;

// TODO: Auto-generated Javadoc
/**
 * The Class Physics.
 */
public class Physics extends Mobile {

	/** The x. */
	int x = this.mobile.getX();
	
	/** The y. */
	int y = this.mobile.getY();
	
	/** The mobile. */
	Mobile mobile;
	
	/** The direction. */
	Direction direction;
	
	/** The player. */
	Player player;
	
	/** The right detection. */
	private boolean rightDetection = false;
	
	/** The left detection. */
	private boolean leftDetection = false;
	
	/** The get on the map. */
	private Map getOnTheMap[][];

	/** The strategy. */
	BehaviorGetBehavior strategy;

	/**
	 * Instantiates a new physics.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	Physics(Sprite sprite, Collision collision) {
		super(sprite, collision);
	}

	/**
	 * Gets the strategy.
	 *
	 * @return the strategy
	 */
	public BehaviorGetBehavior getStrategy() {
		return this.strategy;
	}

	/**
	 * Sets the strategy.
	 *
	 * @param strategy the new strategy
	 */
	public void setStrategy(BehaviorGetBehavior strategy) {
		this.strategy = strategy;
	}

	/**
	 * Pushing right detection.
	 */
	public void PushingRightDetection() {
		if ((this.mobile.getY() == this.player.getY()) && (this.mobile.getCollision() == Collision.PUSHABLE)) {
			if ((this.mobile.getX() - 1) == this.player.getX()) {
				this.rightDetection = true;
			}
		}

	}

	/**
	 * Pushing left detection.
	 */
	public void PushingLeftDetection() {
		if ((this.mobile.getY() == this.player.getY()) && (this.mobile.getCollision() == Collision.PUSHABLE)) {
			if ((this.mobile.getX() + 1) == this.player.getX()) {
				this.leftDetection = true;
			}
		}
	}

	/**
	 * Pushing right.
	 */
	public void PushingRight() {

		if ((this.rightDetection == true) && (this.direction == this.direction.RIGHT)) {

			new EmptyDirt();
			this.mobile.moveRight();

		}

	}

	/**
	 * Pushing left.
	 */
	public void PushingLeft() {

		if ((this.leftDetection == true) && (this.direction == this.direction.LEFT)) {
			new EmptyDirt();
			this.mobile.moveLeft();
		}
	}

	/**
	 * Checks if is falling.
	 */
	public void isFalling() {

	}

}
