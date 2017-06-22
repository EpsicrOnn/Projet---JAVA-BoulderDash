package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Monster2 extends Physics {
	int lower = 1;
	int higher = 2;
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;

	private final static Sprite SPRITE = new Sprite(9, "Monster2.jpg");

	Monster2() {
		super(SPRITE, Collision.KILLING);
		switch (this.random) {
		case 1:
			this.setStrategy(new Behavior3(this));
			break;
		case 2:
			this.setStrategy(new Behavior4(this));
			break;
		default:
		}
	}
}