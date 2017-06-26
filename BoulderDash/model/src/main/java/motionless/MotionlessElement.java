package motionless;

import model.Collision;
import model.Element;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionlessElement.
 */
public abstract class MotionlessElement extends Element {

	/**
	 * Instantiates a new motionless element.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	MotionlessElement(final Sprite sprite, final Collision collision) {
		super(sprite, collision);
	}
}
