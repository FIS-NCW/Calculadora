/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadoramodelos.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class CalculadoraTest {
    static Calculadora calculadora;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calculadora=new Calculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        double clear=calculadora.getAns();
        double esperado=0;
        assertEquals(clear, esperado,0);
    }
    
    @After
    public void tearDown() {
        calculadora.setAns(0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSuma(){
        double resultado=calculadora.suma(2, 3);
        double esperado=5;
        assertEquals(esperado, resultado,0.0001);
    }
    
    @Test
    public void testResta(){
        double resultado=calculadora.resta(2, 3);
        double esperado=-1;
        assertEquals(esperado, resultado,0.0001);
    }
    
    @Test
    public void testMultiplicacion(){
        double resultado=calculadora.multiplicacion(2, 3);
        double esperado=6;
        assertEquals(esperado, resultado,0.0001);
    }
    
    @Test
    public void testDivision(){
        double resultado=calculadora.division(10, 2);
        double esperado=5;
        assertEquals(esperado, resultado,0.0001);
        
        double resultado2=calculadora.division(50, 0);
        double esperado2=Double.POSITIVE_INFINITY;
        assertEquals(esperado2, resultado2,0);
    }
    
}
