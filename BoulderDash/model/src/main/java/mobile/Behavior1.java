package mobile;

// TODO: Auto-generated Javadoc
/**
 * The Class Behavior1.
 */
public class Behavior1 implements BehaviorGetBehavior {

	/** The lower. */
	int lower = 1;
	
	/** The higher. */
	int higher = 5;
	
	/** The random. */
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;
	
	/** The monster. */
	Physics monster;

	/**
	 * Instantiates a new behavior 1.
	 *
	 * @param M the m
	 */
	public Behavior1(Physics M) {
		this.monster = M;

	}

	/* (non-Javadoc)
	 * @see mobile.BehaviorGetBehavior#getBehavior()
	 */
	@Override
	public void getBehavior() {
		do {

			switch (this.random) {
			case 1:
				this.monster.moveUp();
			case 2:
				this.monster.moveDown();
			case 3:
				this.monster.moveRight();
			case 4:
				this.monster.moveLeft();

			}

		} while (this.monster.alive == true);
	}

}
//