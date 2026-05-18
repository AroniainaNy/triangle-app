package com.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    Triangle t = new Triangle();

    @Test
    public void testEquilateral() {
        assertEquals("Equilateral", t.getType(3, 3, 3));
    }

    @Test
    public void testIsocele() {
        assertEquals("Isocele", t.getType(3, 3, 5));
    }

    @Test
    public void testScalene() {
        assertEquals("Scalene", t.getType(3, 4, 5));
    }
}