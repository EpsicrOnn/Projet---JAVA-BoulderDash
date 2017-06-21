package view;

import java.awt.event.KeyEvent;
import controller.IUserOrder;
import controller.Order;
import controller.UserOrder;

/**
 * <h1>The Class EventPerformer</h1>
 * @author Vincent VALLET
 * @about This class will give order to the Controller to control the character.
 */
class EventPerformer implements IEventPerformer {
	
	/** The order performer. */
	private final IOrderPerformer orderPerformer;

	/**
	 * Instantiates a new event performer.
	 *
	 * @param orderPerformer the order performer
	 */
	public EventPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	/**
	 * Event perform.
	 *
	 * @param keyCode the key code
	 */
	public void eventPerform(final KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	}
	
	/**
	 * Key code to user order.
	 *
	 * @param keyCode the key code
	 * @return the user order
	 */
	private UserOrder keyCodeToUserOrder(final int keyCode) {
		IUserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(0, Order.UP);
			break;
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(0, Order.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(0, Order.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(0, Order.LEFT);
			break;
		default:
			userOrder = null;
		}
		return userOrder;
	}
}
