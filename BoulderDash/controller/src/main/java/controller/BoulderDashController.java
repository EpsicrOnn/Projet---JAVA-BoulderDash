
package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * The Class BDControlleur.
 */
public class BoulderDashController implements IController {

	/** The view system. */
	private IView			boulderdashView;

	/** The stack order. */
	private Order			stackOrder;

	/** The time sleep. */
	private static int		TIME_SLEEP	= 30;
	/** The view. */
	private final IView		view;

	/** The model. */
	private final IModel	model;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public BoulderDashController(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;
	}

	/**
	 * Start.
	 *
	 * @return the view
	 */

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView() {
		return this.view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
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
	 */

	public void play() {

		this.gameLoop();
		this.boulderdashView.closeAll();
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
				this.getMobile().moveRight();
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
			this.view.Scrolling();
			this.view.notify();

		}
		this.viewSystem.displayMessage("Game Over !");
	}

}
