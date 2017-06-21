package fr.boulderdash.model;

import java.awt.Image;

public interface IElement {

	Sprite getSprite();

	Image getImage();
	
	Collision getCollision();
	

}
