package view;

import java.awt.event.KeyEvent;
import controller.IUserOrder;
import controller.Order;
import controller.UserOrder;

class EventPerformer implements IEventPerformer {
	private final IOrderPerformer orderPerformer;

	public EventPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	public void eventPerform(final KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerformer.orderPerform(userOrder);
		}
	}
	
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
