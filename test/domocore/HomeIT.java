/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domocore;

import Entities.Status;
import Entities.PistonedDoor;
import Entities.Home;
import Entities.PistonedWindow;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class HomeIT {
    
    public HomeIT() {
    }
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
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
     * Test of addWindow method, of class Home.
     */
    @Test
    public void testAddWindow() throws Exception {
        System.out.println("addWindow success");
        PistonedWindow window = new PistonedWindow(1);
        Home instance = new Home();
        instance.addWindow(window);
        assertEquals(window, instance.getPistonedWindow(1));
    }
    
    /**
     * Test of addWindow method, of class Home.
     * When a window with the same id has been added.
     */
    @Test(expected = Exception.class)
    public void testAddWindow_Failed() throws Exception {
        System.out.println("addWindow fail");
        PistonedWindow window = new PistonedWindow(1);
        Home instance = new Home();
        instance.addWindow(window);
        instance.addWindow(window);
    }

    /**
     * Test of addDoor method, of class Home.
     */
    @Test
    public void testAddDoor() throws Exception {
        System.out.println("addDoor");
        PistonedDoor door = new PistonedDoor(1);
        Home instance = new Home();
        instance.addDoor(door);
        assertEquals(door, instance.getPistonedDoor(1));
    }
    
    /**
     * Test of addDoor method, of class Home.
     * When another door with the same id has been added.
     */
    @Test(expected = Exception.class)
    public void testAddDoor_Failed() throws Exception {
        System.out.println("addDoor");
        PistonedDoor door = new PistonedDoor(1);
        Home instance = new Home();
        instance.addDoor(door);
        instance.addDoor(door);
    }

    /**
     * Test of removeWindow method, of class Home.
     */
    @Test(expected = Exception.class)
    public void testRemoveWindow() throws Exception {
        System.out.println("removeWindow");
        PistonedWindow window = new PistonedWindow(1);
        Home instance = new Home();
        instance.addWindow(window);
        instance.removeWindow(window);
        PistonedWindow expectedWindow = instance.getPistonedWindow(1);
    }
    
    /**
     * Test of removeWindow method, of class Home.
     */
    @Test(expected = Exception.class)
    public void testRemoveWindow_that_dont_exists() throws Exception {
        System.out.println("removeWindow");
        PistonedWindow window = new PistonedWindow(1);
        Home instance = new Home();
        instance.addWindow(window);
        PistonedWindow newWindow = new PistonedWindow(2);
        instance.removeWindow(newWindow);
    }

    /**
     * Test of removeDoor method, of class Home.
     */
    @Test(expected = Exception.class)
    public void testRemoveDoor() throws Exception {
        System.out.println("removeDoor");
        PistonedDoor door = new PistonedDoor(1);
        Home instance = new Home();
        instance.addDoor(door);
        instance.removeDoor(door);
        PistonedDoor expectedDoor = instance.getPistonedDoor(1);
    }
    
    /**
     * Test of removeDoor method, of class Home.
     * When the expected door to be removed doesnt exists
     */
    @Test(expected = Exception.class)
    public void testRemoveDoor_that_dont_exists() throws Exception {
        System.out.println("removeDoor");
        PistonedDoor door = new PistonedDoor(1);
        Home instance = new Home();
        instance.addDoor(door);
        PistonedDoor newDoor = new PistonedDoor(2);
        instance.removeDoor(newDoor);
    }

    /**
     * Test of getPistonedWindow method, of class Home.
     */
    @Test
    public void testGetPistonedWindow() throws Exception {
        System.out.println("getPistonedWindow");
        int id = 1;
        Home instance = new Home();
        PistonedWindow window = new PistonedWindow(id);
        instance.addWindow(window);
        PistonedWindow expResult = window;
        PistonedWindow result = instance.getPistonedWindow(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPistonedDoor method, of class Home.
     */
    @Test
    public void testGetPistonedDoor() throws Exception {
        System.out.println("getPistonedDoor");
        int id = 0;
        PistonedDoor door = new PistonedDoor(id);
        Home instance = new Home();
        instance.addDoor(door);
        PistonedDoor expResult = door;
        PistonedDoor result = instance.getPistonedDoor(id);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sayGeneralStatus method, of class Home.
     */
    @Test
    public void testSayGeneralStatus() {
        String expected = "The window 1 is " + Status.OPEN.name();
        PistonedWindow window = new PistonedWindow(1);
        window.open();
        Home instance = new Home();
        try{
            instance.addWindow(window);
            instance.sayGeneralStatus();
            String result = outContent.toString();
            assertEquals(expected.trim().toLowerCase(), result.trim().toLowerCase());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of openWindow method, of class Home.
     */
    @Test
    public void testOpenWindow() throws Exception {
        System.out.println("open a window of the home");
        int id = 0;
        int percentage = 10;
        Home instance = new Home();
        PistonedWindow window = new PistonedWindow(id);
        instance.addWindow(window);
        instance.openWindow(id, percentage);
        assertEquals(Status.OPEN,instance.getPistonedWindow(id).getStatus());
    }

    /**
     * Test of openDoor method, of class Home.
     */
    @Test
    public void testOpenDoor() throws Exception {
        System.out.println("openDoor");
        int id = 1;
        int percentage = 10;
        Home instance = new Home();
        PistonedDoor door = new PistonedDoor(id);
        instance.addDoor(door);
        instance.openDoor(id, percentage);
        assertEquals(Status.OPEN, instance.getPistonedDoor(id).getStatus());
    }

    /**
     * Test of closeWindow method, of class Home.
     */
    @Test
    public void testCloseWindow() throws Exception {
        System.out.println("closeWindow");
        int id = 0;
        int percentage = 10;
        PistonedWindow window = new PistonedWindow(id);
        window.open();
        Home instance = new Home();
        instance.addWindow(window);
        instance.closeWindow(id, percentage);
        assertEquals(Status.OPEN, instance.getPistonedWindow(id).getStatus());
    }

    /**
     * Test of closeDoor method, of class Home.
     */
    @Test
    public void testCloseDoor() throws Exception {
        System.out.println("closeDoor");
        int id = 0;
        int percentage = 100;
        PistonedDoor door = new PistonedDoor(id);
        door.open();
        Home instance = new Home();
        instance.addDoor(door);
        instance.closeDoor(id, percentage);
        assertEquals(Status.CLOSE, instance.getPistonedDoor(id).getStatus());
    }
    
}
