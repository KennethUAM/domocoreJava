/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Actuators.Actuator;
import Actuators.Servo;
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
public class OpenCloseElementByServoIT {
    
    public OpenCloseElementByServoIT() {
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
     * Test of getServoSteps method, of class OpenCloseElementByServo.
     */
    @Test
    public void testGetServoSteps() {
        System.out.println("getServoSteps");
        OpenCloseElementByServo instance = new ServoWindow(1);
        int expResult = 3;
        instance.open(3);
        int result = instance.getServoSteps();
        assertEquals(expResult, result);
    }

    /**
     * Test of open method, of class OpenCloseElementByServo.
     */
    @Test
    public void testOpen_0args() {
        System.out.println("open");
        OpenCloseElementByServo instance = new ServoWindow(1);
        instance.open();
        String expected = Status.OPEN.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of open method, of class OpenCloseElementByServo.
     */
    @Test
    public void testOpen_int() {
        System.out.println("open");
        int percentage = 5;
        OpenCloseElementByServo instance = new ServoWindow(1);
        instance.open(percentage);
        String expected = Status.OPEN.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByServo.
     */
    @Test
    public void testClose_0args() {
        System.out.println("close");
        int steps = 3;
        OpenCloseElementByServo instance = new ServoWindow(1);
        instance.open(steps);
        instance.close();
        String expected = Status.CLOSE.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of close method, of class OpenCloseElementByServo.
     */
    @Test
    public void testClose_int() {
        System.out.println("close");
        int percentage = 3;
        OpenCloseElementByServo instance = new ServoWindow(1);
        instance.open(percentage);
        instance.close(percentage);
        String expected = Status.CLOSE.name();
        assertEquals(expected, instance.getStatus().name());
    }

    /**
     * Test of activateActuator method, of class OpenCloseElementByServo.
     */
    @Test
    public void testActivateActuator() {
        System.out.println("activateActuator");
        Actuator actuator = new Servo();
        OpenCloseElementByServo instance = new ServoWindow(1);
        instance.open(3);
        instance.activateActuator(actuator);
        int expected = 3;
        assertEquals(expected, instance.getServoSteps());
    }
    
}
