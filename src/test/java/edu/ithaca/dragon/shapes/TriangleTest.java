package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest (){
        Triangle myTriangle = new Triangle(1, 1);
        assertEquals(1, myTriangle.calcArea());
        
        myTriangle = new Triangle(4, 8);
        assertEquals(32, myTriangle.calcArea());

        myTriangle = new Triangle(2, 3);
        assertEquals(6, myTriangle.calcArea());
    }
}
