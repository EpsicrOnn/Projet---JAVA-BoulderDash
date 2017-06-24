package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ExampleTest.
 */
public class ExampleTest {
    
    /** The example. */
    private Example example;

    /**
     * Sets the up before class.
     *
     * @throws Exception the exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Tear down after class.
     *
     * @throws Exception the exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        this.example = new Example(1, "Example test");
    }

    /**
     * Tear down.
     *
     * @throws Exception the exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test get id.
     */
    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.example.getId());
    }

    /**
     * Test get name.
     */
    @Test
    public void testGetName() {
        final String expected = "Example test";
        assertEquals(expected, this.example.getName());
    }

    /**
     * Test set name.
     */
    @Test
    public void testSetName() {
        String expected = "Example test";
        assertEquals(expected, this.example.getName());
        expected = "Example test modified";
        this.example.setName(expected);
        assertEquals(expected, this.example.getName());
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        final String expected = "1 : Example test";
        assertEquals(expected, this.example.toString());
    }

}
