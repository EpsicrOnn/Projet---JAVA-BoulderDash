package fr.boulderdash.model.mobile;

public class Behavior1 implements BehaviorGetBehavior {

	int lower = 1;
	int higher = 4;
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;
	Monster monster;

	public Behavior1(Monster M) {
		this.monster = M;

	}

	@Override
	public void getBehavior() {
		do {

			switch (this.random) {
			case 1:
				this.monster.moveUp();
			case 2:
				this.monster.moveDown();
			case 3:
				this.monster.moveRight();
			case 4:
				this.monster.moveLeft();

			}

		} while (this.monster.alive == true);
	}

}
//