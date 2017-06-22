package controller;

// TODO: Auto-generated Javadoc
/**
 * The Class UserOrder.
 */
public class UserOrder implements IUserOrder {
	
	/** The player. */
	private final int		player;
	
	/** The order. */
	private final EOrder	order;

	/**
	 * Instantiates a new user order.
	 *
	 * @param player the player
	 * @param order the order
	 */
	public UserOrder(final int player, final EOrder order) {
		this.player = player;
		this.order = order;
	}

	/* (non-Javadoc)
	 * @see controller.IOrder#getPlayer()
	 */
	@Override
	public int getPlayer() {
		return this.player;
	}

	/* (non-Javadoc)
	 * @see controller.IOrder#getOrder()
	 */
	@Override
	public EOrder getOrder() {
		return this.order;
	}

}