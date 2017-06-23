package fr.boulderdash.model.motionless;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class EmptyDirt extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(3, "EmptyDirt.jpeg");

	public EmptyDirt() {
		super(SPRITE, Collision.RECOVERABLE);
	}

}
