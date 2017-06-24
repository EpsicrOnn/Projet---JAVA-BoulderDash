package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 */
public class Sprite {

	/** The image. */
	private Image image;

	/** The image name. */
	private String imageName;

	/** The console image. */
	private int consoleImage;

	/** The image loaded. */
	private boolean imageLoaded;
	private int databaseIDImage;

	/**
	 * Instantiates a new sprite.
	 *
	 * @param i
	 *            the i
	 * @param imageName
	 *            the image name
	 */
	public Sprite(final int i, final String imageName) {
		this.setDatabaseIDImage(this.databaseIDImage);
		this.setImageName(imageName);
	}

	/**
	 * Instantiates a new sprite.
	 *
	 * @param character
	 *            the character
	 */
	public Sprite(final char character) {
		this(character, "noimage.jpg");
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public final Image getImage() {
		return this.image;
	}

	/**
	 * Load image.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public final void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
	}

	/**
	 * Gets the console image.
	 *
	 * @return the console image
	 */
	public final int getConsoleImage() {
		return this.consoleImage;
	}

	/**
	 * Sets the image.
	 *
	 * @param image
	 *            the new image
	 */
	private void setImage(final Image image) {
		this.image = image;
	}

	/**
	 * Sets the console image.
	 *
	 * @param i
	 *            the new console image
	 */
	private void setConsoleImage(final int i) {
		this.consoleImage = i;
	}

	/**
	 * Gets the image name.
	 *
	 * @return the image name
	 */
	public final String getImageName() {
		return this.imageName;
	}

	/**
	 * Sets the image name.
	 *
	 * @param imageName
	 *            the new image name
	 */
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Checks if is image loaded.
	 *
	 * @return true, if is image loaded
	 */
	public final boolean isImageLoaded() {
		return this.imageLoaded;
	}

	/**
	 * Sets the image loaded.
	 *
	 * @param isImageLoaded
	 *            the new image loaded
	 */
	public final void setImageLoaded(final boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}

	public int getDatabaseIDImage() {
		return this.databaseIDImage;

	}

	public void setDatabaseIDImage(final int databaseIDImage) {
		this.databaseIDImage = databaseIDImage;
	}
}
