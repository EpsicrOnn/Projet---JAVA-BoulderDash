package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.BoulderDashController;

public class BDController_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDirection() {
		final BoulderDashController controller = new BoulderDashController(null, null);
		final String Direction = "UP";
		switch (Direction) {
		case "UP":
			assertEquals("UP", controller.getStackOrder());

		}
	}

}
