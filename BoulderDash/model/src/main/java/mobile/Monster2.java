package mobile;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster2.
 */
public class Monster2 extends Physics {
	
	/** The lower. */
	int lower = 1;
	
	/** The higher. */
	int higher = 2;
	
	/** The random. */
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;

	/** The Constant SPRITE. */
	private final static Sprite SPRITE = new Sprite(9, "Monster2.jpg");

	/**
	 * Instantiates a new monster 2.
	 */
	Monster2() {
		super(SPRITE, Collision.KILLING);
		switch (this.random) {
		case 1:
			this.setStrategy(new Behavior3(this));
			break;
		case 2:
			this.setStrategy(new Behavior4(this));
			break;
		default:
		}
	}
}