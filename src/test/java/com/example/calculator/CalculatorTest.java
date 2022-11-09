package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void initCalculator(){
        calc = new Calculator();
    }
    @Test
    public void testAdd(){
        int result = calc.add(1,2);
        assertEquals (3, result);

    }
    /*public void testMultiply(){
        int result = calc.multiply(1,2);
        assertEquals (2, result);
    }*/



}
