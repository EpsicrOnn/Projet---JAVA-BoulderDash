package fr.boulderdash.model.mobile;

public class Behavior2 implements BehaviorGetBehavior {

	Monster monster;

	public Behavior2(Monster M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		this.monster.moveDown();
	}
}
