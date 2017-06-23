
package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * The Class BDControlleur.
 */
public class BoulderDashController implements IController {

	/** The view system. */
	private IView			viewSystem;

	/** The stack order. */
	private EOrder			stackOrder;

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
	public void orderPerform(final EOrder userOrder) {
		this.setStackOrder(userOrder);
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final EOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	public EOrder getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = EOrder.NOP;
	}

	/**
	 * Play.
	 */

	public void play() {

		this.gameLoop();
		this.viewSystem.closeAll();
	}

	/**
	 * Sets the BD view.
	 *
	 * @param viewSystem
	 *            the new BD view
	 */
	public void setBDView(final IView viewSystem) {
		this.viewSystem = viewSystem;
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
