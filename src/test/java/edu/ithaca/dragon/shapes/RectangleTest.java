package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    
    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest (){
        Rectangle myRectangle = new Rectangle(1, 1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(1, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(4, 8);
        assertEquals(32, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(2, 3);
        assertEquals(6, myRectangle.calcArea(), 0.0000000001);
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(4, 6);
        double lengthExpected = 8;
        double widthExpected = 12;
        
        myRectangle.doubleSize();

        assertEquals(lengthExpected, myRectangle.length);
        assertEquals(widthExpected, myRectangle.width);
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(4, 8);

        assertEquals(8.944, myRectangle.longestLineWithin(), 0.001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(RuntimeException.class, () -> new Rectangle(0, 0));
    }
}