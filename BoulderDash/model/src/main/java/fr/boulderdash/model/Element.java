package fr.boulderdash.model;

import java.awt.Image;

public abstract class Element implements IElement {

	private Sprite sprite;
	private Collision collision;

	public Element(final Sprite sprite, final Collision collision) {
		this.setSprite(sprite);
		this.setCollision(this.collision);
	}

	@Override
	public final Sprite getSprite() {
		return this.sprite;
	}

	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	@Override
	public final Collision getCollision() {
		return this.collision;
	}

	private void setCollision(final Collision collision) {
		this.collision = collision;
	}

	@Override
	public final Image getImage() {
		return this.getSprite().getImage();
	}

}
