package mobile;

import model.Collision;
import model.Map;
import model.Sprite;
import motionless.EmptyDirt;

public class Physics extends Mobile {

	int x = this.mobile.getX();
	int y = this.mobile.getY();
	Mobile mobile;
	Direction direction;
	Player player;
	private boolean rightDetection = false;
	private boolean leftDetection = false;
	private Map getOnTheMap[][];

	BehaviorGetBehavior strategy;

	Physics(Sprite sprite, Collision collision) {
		super(sprite, collision);
	}

	public BehaviorGetBehavior getStrategy() {
		return this.strategy;
	}

	public void setStrategy(BehaviorGetBehavior strategy) {
		this.strategy = strategy;
	}

	public void PushingRightDetection() {
		if ((this.mobile.getY() == this.player.getY()) && (this.mobile.getCollision() == Collision.PUSHABLE)) {
			if ((this.mobile.getX() - 1) == this.player.getX()) {
				this.rightDetection = true;
			}
		}

	}

	public void PushingLeftDetection() {
		if ((this.mobile.getY() == this.player.getY()) && (this.mobile.getCollision() == Collision.PUSHABLE)) {
			if ((this.mobile.getX() + 1) == this.player.getX()) {
				this.leftDetection = true;
			}
		}
	}

	public void PushingRight() {

		if ((this.rightDetection == true) && (this.direction == this.direction.RIGHT)) {

			new EmptyDirt();
			this.mobile.moveRight();

		}

	}

	public void PushingLeft() {

		if ((this.leftDetection == true) && (this.direction == this.direction.LEFT)) {
			new EmptyDirt();
			this.mobile.moveLeft();
		}
	}

	public void isFalling() {

	}

}
