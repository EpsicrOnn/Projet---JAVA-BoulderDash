package motionless;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Dirt.
 */
public class Dirt extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(2, "Dirt.jpeg");

	/**
	 * Instantiates a new dirt.
	 */
	Dirt() {
		super(SPRITE, Collision.PENETRABLE);
	}
}
