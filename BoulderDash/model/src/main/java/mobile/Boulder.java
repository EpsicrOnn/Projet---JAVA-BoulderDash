package mobile;

import model.Collision;
import model.Sprite;

public class Boulder extends Physics {
	private final static Sprite SPRITE = new Sprite(7, "Boulder.jpg");

	Boulder(Sprite sprite, Collision collision) {
		super(SPRITE, collision.PUSHABLE);

	}

}
