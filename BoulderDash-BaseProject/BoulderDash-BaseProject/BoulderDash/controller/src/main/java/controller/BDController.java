
package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * The Class BDControlleur.
 */
public class BDController implements IController {

	/** The view system. */
	private IBoulderDashView	viewSystem;

	/** The stack order. */
	private EOrder				stackOrder;

	/** The time sleep. */
	private static int			TIME_SLEEP	= 30;
	/** The view. */
	private final IView			view;

	/** The model. */
	private final IModel		model;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public BDController(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;
	}

	/**
	 * Start.
	 *
	 * @return the view
	 */
	/*
	 * public void start() throws SQLException {
	 * this.getView().displayMessage(this.getModel().getExampleById(1).toString(
	 * ));
	 *
	 * this.getView().displayMessage(this.getModel().
	 * getExampleByName("Example 2").toString());
	 *
	 * final List<Example> examples = this.getModel().getAllExamples(); final
	 * StringBuilder message = new StringBuilder(); // a.append(" bar); for
	 * (final Example example : examples) { message.append(example);
	 * message.append('\n'); }
	 * this.getView().displayMessage(message.toString()); }
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
	/*
	 * if (userOrder != null) { final IMobile player =
	 * this.BoulderDashModel.getMobileByPlayer(userOrder.getPlayer()); if
	 * (player != null) { Direction direction; switch (userOrder.getOrder()) {
	 * case UP: direction = Direction.UP; break; case RIGHT: direction =
	 * Direction.RIGHT; break; case DOWN: direction = Direction.DOWN; break;
	 * case LEFT: direction = Direction.LEFT; break; case NOP: break; default:
	 * direction =
	 * this.BoulderDashModel.getMobileByPlayer(userOrder.getPlayer()).
	 * getDirection();
	 *
	 * } } } }
	 */

	// this.getView().displayMessage(this.getModel().getExampleById(1).toString());

	// this.getView().displayMessage(this.getModel().getExampleByName("Example
	// 2").toString());

	// final List<Example> examples = this.getModel().getAllExamples();
	// final StringBuilder message = new StringBuilder();
	// a.append(" bar);
	// for (final Example example : examples) {
	// message.append(example);
	// message.append('\n');
	// }

	// this.getView().displayMessage(message.toString());
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
	public void setBDView(final IBoulderDashView viewSystem) {
		this.viewSystem = viewSystem;
	}

	/**
	 * Game loop.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	private void gameLoop() throws SQLException {
		while (!this.getModel().getMobile.isAlive) {
			try {
				Thread.sleep(TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getPlayer().moveRight();
				break;
			case LEFT:
				this.getModel().getPlayer().moveLeft();
				break;
			case UP:
				this.getModel().getPlayer().moveUp();
				break;
			case DOWN:
				this.getModel().getPlayer().moveDown();
				break;
			case NOP:
			default:
				this.getModel().getPlayer().doNothing();
				break;
			}
			this.clearStackOrder();
			this.view.Scrolling();
			this.view.notify();

		}
		this.viewSystem.displayMessage("Game Over !");
	}

	@Override
	public void IOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void IOrderPerformer() {
		// TODO Auto-generated method stub

	}

}
