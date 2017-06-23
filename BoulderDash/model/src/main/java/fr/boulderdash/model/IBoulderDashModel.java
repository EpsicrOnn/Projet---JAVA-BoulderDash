package fr.boulderdash.model;

import fr.boulderdash.model.mobile.IMobile;

public interface IBoulderDashModel {

	IMobile getPlayer();

	IMap getMap();

	IMobile getMobile();

}
