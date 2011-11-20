/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amalvag
 */
public class EnvironmentTest {

    public EnvironmentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addDefinition method, of class Environment.
     */
    @Test
    public void testAddDefinition() {
        System.out.println("addDefinition");
        String name = "";
        Definition defObject = null;
        Environment instance = new Environment();
        instance.addDefinition(name, defObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOperation method, of class Environment.
     */
    @Test
    public void testAddOperation() {
        System.out.println("addOperation");
        String name = "";
        Operation opObject = null;
        Environment instance = new Environment();
        instance.addOperation(name, opObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Environment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Environment instance = new Environment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}