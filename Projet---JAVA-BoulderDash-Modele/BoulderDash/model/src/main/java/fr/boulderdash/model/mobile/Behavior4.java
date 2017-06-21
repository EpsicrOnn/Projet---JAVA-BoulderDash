package fr.boulderdash.model.mobile;

public class Behavior4 implements BehaviorGetBehavior {

	Physics monster;

	public Behavior4(Physics M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		this.monster.moveRight();
	}
}
