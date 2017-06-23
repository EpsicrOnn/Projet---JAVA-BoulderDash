package controller;

public interface IBoulderDashController {

	BoulderDashController gameLoop();

	BoulderDashController play();

	BoulderDashController getOrderPerformer();

	ControllerFacade start();
}
