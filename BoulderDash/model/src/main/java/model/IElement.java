package model;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * The Interface IElement.
 */
public interface IElement {

	/**
	 * Gets the sprite.
	 *
	 * @return the sprite
	 */
	Sprite getSprite();

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	Image getImage();
	
	/**
	 * Gets the collision.
	 *
	 * @return the collision
	 */
	Collision getCollision();
	

}
