package fr.boulderdash.model.mobile;

public class Behavior3 implements BehaviorGetBehavior {

	Physics monster;

	public Behavior3(Physics M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		this.monster.moveUp();
	}
}
