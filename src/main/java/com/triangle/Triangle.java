package com.triangle;

public class Triangle {
    public String getType(int a, int b, int c) {
        if (a == b && b == c) return "Equilateral";
        if (a == b || b == c || a == c) return "Isocele";
        return "Scalene";
    }
}