package fr.boulderdash.model.motionless;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Element;
import fr.boulderdash.model.Sprite;

public abstract class MotionlessElement extends Element {

	MotionlessElement(final Sprite sprite, final Collision collision) {
		super(sprite, collision);
	}
}
