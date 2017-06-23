package fr.boulderdash.model.motionless;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Wall extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(1, "Wall.jpeg");

	Wall() {
		super(SPRITE, Collision.PENETRABLE);
	}
}
