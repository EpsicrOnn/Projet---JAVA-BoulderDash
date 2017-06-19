package fr.boulderdash.model.motionless;

public abstract class MotionlessElementFactory {

	private static final Wall wall = new Wall();
	private static final Dirt dirt = new Dirt();
	private static final EmptyDirt emptydirt = new EmptyDirt();
	private static final Exit exit = new Exit();

	private static MotionlessElement[] motionlessElements = {

			wall, dirt, emptydirt, exit, };

}
