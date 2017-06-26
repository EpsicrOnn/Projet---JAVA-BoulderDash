package mobile;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Boulder.
 */
public class Boulder extends Physics {
	
	/** The Constant SPRITE. */
	private final static Sprite SPRITE = new Sprite(7, "Boulder.jpg");

	/**
	 * Instantiates a new boulder.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	Boulder(Sprite sprite, Collision collision) {
		super(SPRITE, collision.PUSHABLE);

	}

}
