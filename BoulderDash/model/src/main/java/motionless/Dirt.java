package motionless;

import model.Collision;
import model.Sprite;

public class Dirt extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(2, "Dirt.jpeg");

	Dirt() {
		super(SPRITE, Collision.PENETRABLE);
	}
}
