/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domocore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Jheron Chacon
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    domocore.OpenCloseElementByPistonIT.class, 
    domocore.HomeIT.class,
    Entities.OpenCloseElementByLinedMotorIT.class,
    Entities.OpenCloseElementByServoIT.class
})
public class UnitTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
