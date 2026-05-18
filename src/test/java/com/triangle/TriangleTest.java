package com.triangle;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    Triangle t = new Triangle();
    // test wehook
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