package motionless;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class EmptyDirt.
 */
public class EmptyDirt extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(3, "EmptyDirt.jpeg");

	/**
	 * Instantiates a new empty dirt.
	 */
	public EmptyDirt() {
		super(SPRITE, Collision.RECOVERABLE);
	}

}
