/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancaentornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author migue
 */
public class GestorBancoTest {
    
    public GestorBancoTest() {
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
     * Test of modificarValores method, of class GestorBanco.
     */
    @Test
    public void testModificarValores() {
        System.out.println("modificarValores");
        Cliente cli = null;
        GestorBanco instance = new GestorBanco();
        instance.modificarValores(cli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class GestorBanco.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        GestorBanco instance = new GestorBanco();
        int expResult = 0;
        int result = instance.menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
