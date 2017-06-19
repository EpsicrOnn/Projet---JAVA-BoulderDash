package fr.boulderdash.model.motionless;

public class Wall extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(1, "Exit.jpeg");

	Wall() {
		super(SPRITE, Collision.PENETRABLE);
	}
}