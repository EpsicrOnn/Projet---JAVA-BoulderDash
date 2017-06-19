package fr.boulderdash.model.motionless;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Exit extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(5, "Exit.jpeg");

	Exit() {
		super(SPRITE, Collision.PENETRABLE);
	}

}
