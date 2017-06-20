package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Monster1 extends Monster {

	private final static Sprite SPRITE = new Sprite(6, "Monster1.jpeg");

	Monster1() {
		super(SPRITE, Collision.BLOCKING);
		this.setStrategy(new Behavior1(this));

	}

}
