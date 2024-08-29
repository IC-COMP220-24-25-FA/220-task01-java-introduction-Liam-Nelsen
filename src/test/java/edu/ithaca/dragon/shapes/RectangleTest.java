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
        
        myRectangle = new Rectangle(5.5, 5.5);
        assertEquals(30.25, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(0.1, 0.1);
        assertEquals(0.01, myRectangle.calcArea(), 0.0000000001);
    }
}