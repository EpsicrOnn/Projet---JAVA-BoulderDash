package mobile;

import java.io.IOException;

import model.Collision;
import model.IMap;
import model.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player extends Mobile {

	/** The Constant sprite. */
	private static final Sprite sprite = new Sprite(8, "DoNothing.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite spriteTurnLeft = new Sprite(8, "PlayerTurnLeft.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite spriteTurnRight = new Sprite(8, "PlayerTurnRight.png");

	/** The Constant spriteTurnUp. */
	private static final Sprite spriteTurnUp = new Sprite(8, "PlayerTurnUp.png");

	/** The Constant spriteTurnDown. */
	private static final Sprite spriteTurnDown = new Sprite(8, "PlayerTurnDown.png");

	/**
	 * Instantiates a new player.
	 *
	 * @param x the x
	 * @param y the y
	 * @param map the map
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public Player(final int x, final int y, final IMap map) throws IOException {
		super(x, y, sprite, map, Collision.BLOCKING);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteTurnUp.loadImage();
		spriteTurnDown.loadImage();
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#moveLeft()
	 */
	@Override
	public final void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#moveRight()
	 */
	@Override
	public final void moveRight() {
		super.moveRight();
		this.setSprite(spriteTurnRight);
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#moveUp()
	 */
	@Override
	public final void moveUp() {
		super.moveLeft();
		this.setSprite(spriteTurnUp);
	}

	/* (non-Javadoc)
	 * @see mobile.Mobile#moveDown()
	 */
	@Override
	public final void moveDown() {
		super.moveLeft();
		this.setSprite(spriteTurnDown);
	}

	/**
	 * Do nothing.
	 */
	public final void DoNothing() {
		super.moveLeft();
		this.setSprite(sprite);

	}
}
