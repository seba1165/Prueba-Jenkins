/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seba
 */
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getRut method, of class Persona.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Persona instance = new Persona("nombre", "nombre@usach.cl", "18.293.486-0");
        String expResult = "18.293.486-0";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRut method, of class Persona.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Persona instance = new Persona();
        instance.setRut(rut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Persona.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Persona instance = new Persona("nombre", "nombre@usach.cl", "18.293.486-0");
        String expResult = "nombre";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Persona.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Persona instance = new Persona();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Persona.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Persona instance = new Persona("nombre", "nombre@usach.cl", "18.293.486-0");
        String expResult = "nombre@usach.cl";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Persona.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Persona instance = new Persona();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Persona instance = new Persona();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Persona.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Persona.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of rutValido method, of class Persona.
     */
    @Test
    public void testRutValido() {
        System.out.println("rutValido");
        Persona instance = new Persona("nombre", "nombre@usach.cl", "18.293.486-0");
        boolean expResult = true;
        boolean result = instance.rutValido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
