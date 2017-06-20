package fr.boulderdash.model.mobile;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.Sprite;

public class Monster extends Mobile {

	BehaviorGetBehavior strategy;

	Monster(Sprite sprite, Collision collision) {
		super(sprite, collision);
	}

	public BehaviorGetBehavior getStrategy() {
		return this.strategy;
	}

	public void setStrategy(BehaviorGetBehavior strategy) {
		this.strategy = strategy;
	}

}
