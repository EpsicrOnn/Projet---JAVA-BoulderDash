package gameframe;

import java.awt.event.KeyEvent;

/**
 * <h1> The Interface IEventPerformer</h1>
 * @author Vincent VALLET
 * @about This interface will gather all the method of EventPerformer.
 */
public interface IEventPerformer {
	
	/**
	 * Event perform.
	 *
	 * @param keyCode the key code
	 */
	public void eventPerform(final KeyEvent keyCode);
}