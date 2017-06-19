package fr.boulderdash.model.motionless;

public class Exit extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(5, "Exit.jpeg");

	Exit() {
		super(SPRITE, Collision.PENETRABLE);
	}

}
