package motionless;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating MotionlessElement objects.
 */
public abstract class MotionlessElementFactory {

	/** The Constant wall. */
	private static final Wall wall = new Wall();
	
	/** The Constant dirt. */
	private static final Dirt dirt = new Dirt();
	
	/** The Constant emptydirt. */
	private static final EmptyDirt emptydirt = new EmptyDirt();
	
	/** The Constant exit. */
	private static final Exit exit = new Exit();

	/** The motionless elements. */
	private static MotionlessElement[] motionlessElements = {

			wall, dirt, emptydirt, exit, };

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createWall() {
		return wall;
	}

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createDirt() {
		return dirt;
	}

	/**
	 * Empty dirt.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement EmptyDirt() {
		return emptydirt;
	}

	/**
	 * Creates a new MotionlessElement object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createExit() {
		return exit;
	}

	/**
	 * Gets the from file symbol.
	 *
	 * @param fileSymbol the file symbol
	 * @return the from file symbol
	 */
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}
		return null;

	}
}