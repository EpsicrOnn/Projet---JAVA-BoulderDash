package fr.boulderdash.model.motionless;

import fr.exia.insanevehicles.model.element.Sprite;

public class Dirt extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(2, "Dirt.jpeg");

	Dirt() {
		super(SPRITE, Collision.PENETRABLE);
	}
}
