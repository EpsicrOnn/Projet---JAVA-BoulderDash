package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Diamond extends Physics {
	private final static Sprite SPRITE = new Sprite(4, "Diamond.jpg");

	Diamond(Sprite sprite, Collision collision) {
		super(SPRITE, collision.RECOVERABLE);
	}

}
