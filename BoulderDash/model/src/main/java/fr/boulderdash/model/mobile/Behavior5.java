package fr.boulderdash.model.mobile;

public class Behavior5 implements BehaviorGetBehavior {

	Physics boulder;
	Player player;

	public Behavior5(Physics boulder) {
		this.boulder = boulder;

	}

	@Override
	public void getBehavior() {

	}

	public void Pushing() {
		if (this.boulder.getY() == this.player.getY()) {
			if ((this.boulder.getX() - 1) == this.player.getX()) {
				if (this.boulder.getX() == this.player.getX()) {

				}

			}
		}
	}

	public void isFalling() {

	}
}
