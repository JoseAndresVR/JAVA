package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void TestSumar() {
    	Calculadora c=new Calculadora();
    	int resultado = c.sumar(5,10);
    	assertTrue(resultado==15);
    }
    
    @Test
    public void TestRestar() {
    	Calculadora r=new Calculadora();
    	int resultado = r.restar(10,20);
    	assertTrue(resultado==15);
    }

}
