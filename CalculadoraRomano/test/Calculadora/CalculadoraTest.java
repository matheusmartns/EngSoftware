/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matheus
 */
public class CalculadoraTest {
    
    private Calculadora instance;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Calculadora();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcularI() {
        int expResult = 1;        
        int result = instance.calcular("I");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterV() {
        int expResult = 5;        
        int result = instance.calcular("V");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterX() {
        int expResult = 10;        
        int result = instance.calcular("X");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterL() {
        int expResult = 50;        
        int result = instance.calcular("L");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterC() {
        int expResult = 100;        
        int result = instance.calcular("C");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterD() {
        int expResult = 500;        
        int result = instance.calcular("D");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterM() {
        int expResult = 1000;        
        int result = instance.calcular("M");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterII() {
        int expResult = 2;        
        int result = instance.calcular("II");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterIL() {
        int expResult = 49;        
        int result = instance.calcular("IL");
        assertEquals(expResult, result);
    }
    
    @Test
    public void converterXIX() {
        int expResult = 19;        
        int result = instance.calcular("XIX");
        assertEquals(expResult, result);
    }
}
