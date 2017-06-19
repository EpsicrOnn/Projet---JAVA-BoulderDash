package fr.boulderdash.model.motionless;

public class EmptyDirt extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(3, "EmptyDirt.jpeg");

	EmptyDirt() {
		super(SPRITE, Collision.PENETRABLE);
	}

}
