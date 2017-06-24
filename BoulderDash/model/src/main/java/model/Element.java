package model;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 */
public abstract class Element implements IElement {

	/** The sprite. */
	private Sprite sprite;
	
	/** The collision. */
	private Collision collision;

	/**
	 * Instantiates a new element.
	 *
	 * @param sprite the sprite
	 * @param collision the collision
	 */
	public Element(final Sprite sprite, final Collision collision) {
		this.setSprite(sprite);
		this.setCollision(this.collision);
	}

	/* (non-Javadoc)
	 * @see model.IElement#getSprite()
	 */
	@Override
	public final Sprite getSprite() {
		return this.sprite;
	}

	/**
	 * Sets the sprite.
	 *
	 * @param sprite the new sprite
	 */
	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	/* (non-Javadoc)
	 * @see model.IElement#getCollision()
	 */
	@Override
	public final Collision getCollision() {
		return this.collision;
	}

	/**
	 * Sets the collision.
	 *
	 * @param collision the new collision
	 */
	private void setCollision(final Collision collision) {
		this.collision = collision;
	}

	/* (non-Javadoc)
	 * @see model.IElement#getImage()
	 */
	@Override
	public final Image getImage() {
		return this.getSprite().getImage();
	}

}
