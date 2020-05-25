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
public class ProyectoBancaEntornosTest {
    
    public ProyectoBancaEntornosTest() {
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
     * Test of main method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProyectoBancaEntornos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuPrincipal method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testMenuPrincipal() {
        System.out.println("menuPrincipal");
        int expResult = 0;
        int result = ProyectoBancaEntornos.menuPrincipal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entrarCuenta method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testEntrarCuenta() {
        System.out.println("entrarCuenta");
        int numCuenta = 0;
        ProyectoBancaEntornos.entrarCuenta(numCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuOperaciones method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testMenuOperaciones() {
        System.out.println("menuOperaciones");
        int expResult = 0;
        int result = ProyectoBancaEntornos.menuOperaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDatos method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testModificarDatos() {
        System.out.println("modificarDatos");
        ProyectoBancaEntornos.modificarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        ProyectoBancaEntornos.ingresar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        ProyectoBancaEntornos.retirar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarSaldo method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testMostrarSaldo() {
        System.out.println("mostrarSaldo");
        ProyectoBancaEntornos.mostrarSaldo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCuentas method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testMostrarCuentas() {
        System.out.println("mostrarCuentas");
        ProyectoBancaEntornos.mostrarCuentas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCuenta method, of class ProyectoBancaEntornos.
     */
    @Test
    public void testCrearCuenta() {
        System.out.println("crearCuenta");
        ProyectoBancaEntornos.crearCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
