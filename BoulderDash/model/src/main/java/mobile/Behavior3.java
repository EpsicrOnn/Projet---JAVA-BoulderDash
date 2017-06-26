package mobile;

// TODO: Auto-generated Javadoc
/**
 * The Class Behavior3.
 */
public class Behavior3 implements BehaviorGetBehavior {

	/** The monster. */
	Physics monster;

	/**
	 * Instantiates a new behavior 3.
	 *
	 * @param M the m
	 */
	public Behavior3(Physics M) {
		this.monster = M;

	}

	/* (non-Javadoc)
	 * @see mobile.BehaviorGetBehavior#getBehavior()
	 */
	@Override
	public void getBehavior() {
		do {
			this.monster.moveUp();
		} while (this.monster.alive == true);
	}
}
