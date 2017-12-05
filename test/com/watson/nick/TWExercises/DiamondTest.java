package com.watson.nick.TWExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {
    Diamond tester;
    @Before
    public void setUp() throws Exception {
        tester = new Diamond();
    }

    @Test
    public void drawIsoscelesTriangle() throws Exception {
        assertEquals("  *  \n *** \n*****", tester.drawIsoscelesTriangle(3));
    }

    @Test
    public void drawDiamond() throws Exception {
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", tester.drawDiamond(3));
    }

    @Test
    public void drawDiamondWithName() throws Exception {
        assertEquals("  *  \n *** \nNick\n *** \n  *  ", tester.drawDiamondWithName(3, "Nick"));
    }
}