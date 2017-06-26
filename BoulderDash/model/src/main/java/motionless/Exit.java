package motionless;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Exit.
 */
public class Exit extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(5, "Exit.jpeg");

	/**
	 * Instantiates a new exit.
	 */
	Exit() {
		super(SPRITE, Collision.PENETRABLE);
	}

}
