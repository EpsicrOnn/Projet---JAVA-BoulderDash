package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Monster1 extends Monster {

	private final static Sprite SPRITE = new Sprite(6, "Monster1.jpeg");
	int lower = 1;
	int higher = 2;
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;

	public void random(){
	switch(this.random){
	case 1 :
		Monster1(){
		super(SPRITE, Collision.BLOCKING);
		this.setStrategy(new Behavior1(this));
	}

	case 2:
		Monster1(){
		super(SPRITE, Collision.BLOCKING);
		this.setStrategy(new Behavior2(this));

		}
	}

}
}