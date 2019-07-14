/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Actuator;
import Actuators.LinearMotor;
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
public class OpenCloseElementByLinedMotorIT {
    
    public OpenCloseElementByLinedMotorIT() {
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
     * Test of open method, of class OpenCloseElementByLinedMotor.
     */
    @Test
    public void testOpen_0args() {
        System.out.println("open");
        OpenCloseElementByLinedMotor instance = new LinedMotorWindow(1);
        instance.open();
        String expected = Status.OPEN.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of open method, of class OpenCloseElementByLinedMotor.
     */
    @Test
    public void testOpen_int() {
        System.out.println("open");
        int percentage = 100;
        OpenCloseElementByLinedMotor instance = new LinedMotorWindow(1);
        instance.open(percentage);
        String expected = Status.OPEN.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByLinedMotor.
     */
    @Test
    public void testClose_0args() {
        System.out.println("close");
        OpenCloseElementByLinedMotor instance = new LinedMotorWindow(1);
        instance.open();
        instance.close();
        String expected = Status.CLOSE.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByLinedMotor.
     */
    @Test
    public void testClose_int() {
        System.out.println("close");
        int percentage = 100;
        OpenCloseElementByLinedMotor instance = new LinedMotorWindow(1);
        instance.open();
        instance.close(percentage);
        String expected = Status.CLOSE.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of activateActuator method, of class OpenCloseElementByLinedMotor.
     */
    @Test
    public void testActivateActuator() {
        System.out.println("activateActuator");
        Actuator actuator = new LinearMotor();
        OpenCloseElementByLinedMotor instance = new LinedMotorWindow(1);
        instance.open();
        instance.activateActuator(actuator);
        int expected = 100;
        assertEquals(expected, instance.getPosition());
    }
    
}
