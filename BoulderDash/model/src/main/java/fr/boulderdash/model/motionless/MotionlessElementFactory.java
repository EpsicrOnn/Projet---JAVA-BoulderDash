package fr.boulderdash.model.motionless;

public abstract class MotionlessElementFactory {

	private static final Wall wall = new Wall();
	private static final Dirt dirt = new Dirt();
	private static final EmptyDirt emptydirt = new EmptyDirt();
	private static final Exit exit = new Exit();

	private static MotionlessElement[] motionlessElements = {

			wall, dirt, emptydirt, exit, };

	public static MotionlessElement createWall() {
		return wall;
	}

	public static MotionlessElement createDirt() {
		return dirt;
	}

	public static MotionlessElement EmptyDirt() {
		return emptydirt;
	}

	public static MotionlessElement createExit() {
		return exit;
	}

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}

	}
}