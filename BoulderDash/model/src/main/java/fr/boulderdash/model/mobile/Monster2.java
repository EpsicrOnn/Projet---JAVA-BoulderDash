package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Monster2 {

	private final static Sprite SPRITE = new Sprite(9, "Monster2.jpg");

	Monster2() {
		super(SPRITE, Collision.BLOCKING);
	}

}
