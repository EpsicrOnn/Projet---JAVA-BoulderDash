package mobile;

// TODO: Auto-generated Javadoc
/**
 * The Class Behavior2.
 */
public class Behavior2 implements BehaviorGetBehavior {

	/** The monster. */
	Physics monster;

	/**
	 * Instantiates a new behavior 2.
	 *
	 * @param M the m
	 */
	public Behavior2(Physics M) {
		this.monster = M;

	}

	/* (non-Javadoc)
	 * @see mobile.BehaviorGetBehavior#getBehavior()
	 */
	@Override
	public void getBehavior() {
		do {
			this.monster.moveDown();
		} while (this.monster.alive = true);
	}
}