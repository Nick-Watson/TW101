package com.watson.nick.TWExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    PrimeFactors tester;
    @Before
    public void setUp() throws Exception {
        tester = new PrimeFactors();
    }

    @Test
    public void generate() throws Exception {
        assertEquals("2,3,5", tester.generate(30));
        assertEquals("", tester.generate(0));
        assertEquals("", tester.generate(1));
        assertEquals("2,5", tester.generate(40));
        assertEquals("2", tester.generate(4));

    }

}