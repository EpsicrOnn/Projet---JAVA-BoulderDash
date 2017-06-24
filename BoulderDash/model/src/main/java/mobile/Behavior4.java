package mobile;

// TODO: Auto-generated Javadoc
/**
 * The Class Behavior4.
 */
public class Behavior4 implements BehaviorGetBehavior {

	/** The monster. */
	Physics monster;

	/**
	 * Instantiates a new behavior 4.
	 *
	 * @param M the m
	 */
	public Behavior4(Physics M) {
		this.monster = M;

	}

	/* (non-Javadoc)
	 * @see mobile.BehaviorGetBehavior#getBehavior()
	 */
	@Override
	public void getBehavior() {
		do {
			this.monster.moveRight();
		} while (this.monster.alive == true);
	}
}