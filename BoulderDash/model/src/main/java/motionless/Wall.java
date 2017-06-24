package motionless;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Wall.
 */
public class Wall extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(1, "Wall.jpeg");

	/**
	 * Instantiates a new wall.
	 */
	Wall() {
		super(SPRITE, Collision.PENETRABLE);
	}
}
