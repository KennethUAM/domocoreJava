/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domocore;

import Entities.Piston;
import Entities.Status;
import Entities.Actuator;
import Entities.PistonedDoor;
import Entities.PistonedWindow;
import Entities.OpenCloseElementByPiston;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jheron Chacon
 */
public class OpenCloseElementByPistonIT {
    
    String expectedResult = "";
    
    public OpenCloseElementByPistonIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of open method, of class OpenCloseElementByPiston.
     */
    @Test
    public void testOpen_0args() {
        System.out.println("open");
        OpenCloseElementByPiston instance = new PistonedWindow(1);
        instance.open();
        expectedResult = Status.OPEN.name();
        assertEquals(expectedResult, instance.getStatus().name());
    }

    /**
     * Test of open method, of class OpenCloseElementByPiston.
     */
    @Test
    public void testOpen_int() {
        System.out.println("open");
        int percentage = 0;
        OpenCloseElementByPiston instance = new PistonedWindow(1);
        instance.open(percentage);
        expectedResult = Status.OPEN.name();
        assertEquals(expectedResult, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByPiston.
     */
    @Test
    public void testClose_0args() {
        System.out.println("close");
        OpenCloseElementByPiston instance = new PistonedDoor(1);
        instance.close();
        expectedResult = Status.CLOSE.name();
        assertEquals(expectedResult, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByPiston.
     */
    @Test
    public void testClose_int() {
        System.out.println("close");
        int percentage = 0;
        OpenCloseElementByPiston instance = new PistonedDoor(1);
        instance.close(percentage);
        expectedResult = Status.CLOSE.name();
        assertEquals(expectedResult, instance.getStatus().name());
    }

    /**
     * Test of activateActuator method, of class OpenCloseElementByPiston.
     */
    @Test
    public void testActivateActuator() {
        System.out.println("activateActuator");
        Actuator actuator = new Piston();
        OpenCloseElementByPiston instance = new PistonedWindow(1);
        instance.open();
        instance.activateActuator(actuator);
        int expectedPercentage = 100;
        assertEquals(expectedPercentage, instance.getPistonPercentage());
    }
    
}
