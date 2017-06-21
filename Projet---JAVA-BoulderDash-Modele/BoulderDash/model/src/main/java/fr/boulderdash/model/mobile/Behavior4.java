package fr.boulderdash.model.mobile;

public class Behavior4 implements BehaviorGetBehavior {

	Monster monster;

	public Behavior4(Monster M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		this.monster.moveRight();
	}
}
