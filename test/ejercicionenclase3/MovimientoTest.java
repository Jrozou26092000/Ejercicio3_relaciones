/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionenclase3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class MovimientoTest {
    
    public MovimientoTest() {
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
     * Test of getFecha method, of class Movimiento.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Movimiento instance = null;
        int expResult = 0;
        int result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Movimiento.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        int fecha = 0;
        Movimiento instance = null;
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldoAnterior method, of class Movimiento.
     */
    @Test
    public void testSetSaldoAnterior() {
        System.out.println("setSaldoAnterior");
        double saldoAnterior = 0.0;
        Movimiento instance = null;
        instance.setSaldoAnterior(saldoAnterior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Movimiento.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        double cantidad = 0.0;
        Movimiento instance = null;
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Movimiento.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Tipo tipo = null;
        Movimiento instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
