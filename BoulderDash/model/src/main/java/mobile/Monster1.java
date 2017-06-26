package mobile;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster1.
 */
public class Monster1 extends Physics {

	/** The Constant SPRITE. */
	private final static Sprite SPRITE = new Sprite(6, "Monster1.jpeg");
	
	/** The lower. */
	int lower = 1;
	
	/** The higher. */
	int higher = 2;
	
	/** The random. */
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;

	/**
	 * Instantiates a new monster 1.
	 */
	Monster1() {
		super(SPRITE, Collision.KILLING);
		switch (this.random) {
		case 1:
			this.setStrategy(new Behavior1(this));
			break;
		case 2:
			this.setStrategy(new Behavior2(this));
			break;
		default:
		}
	}
}