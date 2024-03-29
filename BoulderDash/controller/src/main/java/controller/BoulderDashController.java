
package controller;

import java.sql.SQLException;

import model.IBoulderDashModel;
import model.IMap;
import model.IMobile;
import view.IBoulderDashView;
import view.IView;

/**
 * The Class BDControlleur.
 */
public class BoulderDashController implements IOrderPerformer, IBoulderDashModel {

	/** The view system. */

	private IView boulderdashView;

	/** The stack order. */
	private Order stackOrder;

	/** The time sleep. */
	private static int TIME_SLEEP = 30;
	/** The view. */
	private final IBoulderDashView view;

	/** The model. */
	private final IBoulderDashModel model;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view2
	 *            the view
	 * @param model
	 *            the model
	 */

	public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {

		super();
		this.view = view;
		this.model = model;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IBoulderDashView getView() {
		return this.view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IBoulderDashModel getModel() {
		return this.model;
	}

	/**
	 * Order perform.
	 *
	 * @param userOrder
	 *            the user order
	 */
	public void orderPerform(final Order userOrder) {
		this.setStackOrder(userOrder);
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final Order stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	public Order getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = Order.NOP;
	}

	/**
	 * Play.
	 *
	 * @throws SQLException
	 */

	public void play() throws SQLException {

		this.gameLoop();

	}

	/**
	 * Sets the BD view.
	 *
	 * @param viewSystem
	 *            the new BD view
	 */
	public void setBoulderDashView(final IView boulderdashView) {
		this.boulderdashView = boulderdashView;
	}

	/**
	 * Game loop.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */

	private void gameLoop() throws SQLException {
		while (!this.getModel().getMobile().isAlive()) {
			try {
				Thread.sleep(TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getMobile().moveRight();
				break;
			case LEFT:
				this.getModel().getMobile().moveLeft();
				break;
			case UP:
				this.getModel().getMobile().moveUp();
				break;
			case DOWN:
				this.getModel().getMobile().moveDown();
				break;
			case NOP:
			default:
				this.getModel().getMobile().doNothing();
				break;
			}
			this.clearStackOrder();

			this.view.notify();

		}
		this.boulderdashView.displayMessage("Game Over !");
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public IMobile getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMap getMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public IOrderPerformer getOrderPerformer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void start() {
		// TODO Auto-generated method stub

	}

}
