package motionless;

import model.Collision;
import model.Element;
import model.Sprite;

public abstract class MotionlessElement extends Element {

	MotionlessElement(final Sprite sprite, final Collision collision) {
		super(sprite, collision);
	}
}