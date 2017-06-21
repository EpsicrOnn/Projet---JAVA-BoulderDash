package controller;

public class UserOrder implements IOrder {
	private final int		player;
	private final EOrder	order;

	public UserOrder(final int player, final EOrder order) {
		this.player = player;
		this.order = order;
	}

	@Override
	public int getPlayer() {
		return this.player;
	}

	@Override
	public EOrder getOrder() {
		return this.order;
	}

}