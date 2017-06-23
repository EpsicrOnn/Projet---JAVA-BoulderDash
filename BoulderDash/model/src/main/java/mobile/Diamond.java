package mobile;

import model.Collision;
import model.Sprite;

public class Diamond extends Physics {
	private final static Sprite SPRITE = new Sprite(4, "Diamond.jpg");

	Diamond(Sprite sprite, Collision collision) {
		super(SPRITE, collision.RECOVERABLE);
	}

}
