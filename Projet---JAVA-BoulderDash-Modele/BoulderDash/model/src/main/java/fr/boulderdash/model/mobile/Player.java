package fr.boulderdash.model.mobile;

import java.io.IOException;

import fr.boulderdash.model.Collision;
import fr.boulderdash.model.IMap;
import fr.boulderdash.model.Sprite;

public class Player extends Mobile {

	private static final Sprite sprite = new Sprite(8, "DoNothing.png");

	private static final Sprite spriteTurnLeft = new Sprite(8, "PlayerTurnLeft.png");

	private static final Sprite spriteTurnRight = new Sprite(8, "PlayerTurnRight.png");

	private static final Sprite spriteTurnUp = new Sprite(8, "PlayerTurnUp.png");

	private static final Sprite spriteTurnDown = new Sprite(8, "PlayerTurnDown.png");

	public Player(final int x, final int y, final IMap map) throws IOException {
		super(x, y, sprite, map, Collision.BLOCKING);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteTurnUp.loadImage();
		spriteTurnDown.loadImage();
	}

	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
	}

	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteTurnRight);
	}

	@Override
	public final void moveUp() {
		super.moveLeft();
		this.setSprite(spriteTurnUp);
	}

	@Override
	public final void moveDown() {
		super.moveLeft();
		this.setSprite(spriteTurnDown);
	}

	public final void DoNothing() {
		super.moveLeft();
		this.setSprite(sprite);

	}
}
