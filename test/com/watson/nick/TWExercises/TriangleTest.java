package com.watson.nick.TWExercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle tester;
    @Before
    public void setUp() throws Exception {
        tester = new Triangle();
    }

    @Test
    public void drawAsterisk() throws Exception {
        assertEquals("*", tester.drawAsterisk());
    }

    @Test
    public void drawHorizontalLine() throws Exception {
        assertEquals("***", tester.drawHorizontalLine(3));
    }

    @Test
    public void drawVerticalLine() throws Exception {
        assertEquals("*\n*\n*", tester.drawVerticalLine(3));

    }

    @Test
    public void drawRightAngleTriangle() throws Exception {
        assertEquals("*\n**\n***", tester.drawRightAngleTriangle(3));

    }

}