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
public class DefinitionTest {

    public DefinitionTest() {
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
     * Test of fillEnvironment method, of class Definition.
     */
    @Test
    public void testFillEnvironment() {
        System.out.println("fillEnvironment");
        Definition instance = null;
        instance.fillEnvironment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Definition.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Definition instance = null;
        instance.getName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArgs method, of class Definition.
     */
    @Test
    public void testGetArgs() {
        System.out.println("getArgs");
        Definition instance = null;
        instance.getArgs();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Definition.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Definition instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}