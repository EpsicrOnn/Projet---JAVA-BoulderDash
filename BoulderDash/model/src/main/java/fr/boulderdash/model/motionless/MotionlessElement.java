package fr.boulderdash.model.motionless;

import javax.swing.text.html.parser.Element;

import fr.boulderdash.model.Sprite;

public abstract class MotionlessElement extends Element {

	MotionlessElement(final Sprite sprite, final Collision collision) {
		super(sprite, collision);
	}
}
