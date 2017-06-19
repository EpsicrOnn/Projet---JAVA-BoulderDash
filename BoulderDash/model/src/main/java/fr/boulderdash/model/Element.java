package fr.boulderdash.model;

import java.awt.Image;

public abstract class Element implements IElement {

	private Sprite sprite;
	private Collision collision;

	public Element(final Sprite sprite, final Collision permeability) {
		this.setSprite(sprite);
		this.setCollision(this.collision);
	}

	public final Sprite getSprite() {
		return this.sprite;
	}

	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	public final Collision getCollision() {
		return this.collision;
	}

	private void setCollision(final Collision collision) {
		this.collision = collision;
	}

	public final Image getImage() {
		return this.getSprite().getImage();
	}

}
