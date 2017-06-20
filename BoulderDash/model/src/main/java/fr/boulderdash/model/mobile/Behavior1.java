package fr.boulderdash.model.mobile;

public class Behavior1 {

	int lower = 1;
	int higher = 4;
	int random = (int) (Math.random() * (this.higher - this.lower)) + this.lower;

	public void move() {

		do {

			switch (this.random) {
			case 1:
				mobile.moveUp();
			case 2:
				moveDown();
			case 3:
				Monster.moveRight();
			case 4:
				Monster.moveLeft();

			}

		} while (Monster.alive == true);
	}

}
