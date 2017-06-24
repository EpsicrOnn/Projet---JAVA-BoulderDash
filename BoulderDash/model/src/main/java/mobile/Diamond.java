package mobile;

import model.Collision;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Diamond.
 */
public class Diamond extends Physics {
	
	/** The Constant SPRITE. */
	private final static Sprite SPRITE = new Sprite(4, "Diamond.jpg");

	/**
	 * Instantiates a new diamond.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	Diamond(Sprite sprite, Collision collision) {
		super(SPRITE, collision.RECOVERABLE);
	}

}
