package view;

/**
 * <h1>The Interface IBoulderDashView</h1>
 * @author Vincent VALLET
 * @about This interface will gather all the method of BoulderDashView.
 */
public interface IBoulderDashView {
	
	/**
	 * Display message.
	 *
	 * @param message the message
	 */
	public void displayMessage(final String message);

	/**
	 * Close all.
	 */
	public void closeAll();
}