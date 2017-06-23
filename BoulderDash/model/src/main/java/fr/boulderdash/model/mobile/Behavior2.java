package fr.boulderdash.model.mobile;

public class Behavior2 implements BehaviorGetBehavior {

	Physics monster;

	public Behavior2(Physics M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		do {
			this.monster.moveDown();
		} while (this.monster.alive = true);
	}
}