package fr.boulderdash.model.mobile;

public class Behavior3 implements BehaviorGetBehavior {

	Monster monster;

	public Behavior3(Monster M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		this.monster.moveUp();
	}
}
