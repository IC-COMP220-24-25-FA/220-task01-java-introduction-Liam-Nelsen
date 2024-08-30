package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(4, 6);
        double baseExpected = 8;
        double heightExpected = 12;
        
        myTriangle.doubleSize();

        assertEquals(baseExpected, myTriangle.base);
        assertEquals(heightExpected, myTriangle.height);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(4, 8);

        assertEquals(8, myTriangle.longestLineWithin());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(RuntimeException.class, () -> new Rectangle(0, 0));
    }
}
