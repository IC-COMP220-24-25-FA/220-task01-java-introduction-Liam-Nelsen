package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(21.5, FunctionPractice.calcSalePrice(20, 5, 2.5));
        assertEquals(93.625, FunctionPractice.calcSalePrice(100.5, 15, 8.2), 0.001);
        assertEquals(8.96, FunctionPractice.calcSalePrice(8, 0.5, 1));
    }

    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(3, 3, false));
        assertEquals(false, FunctionPractice.isGoodDog(5, 0, true));
        assertEquals(true, FunctionPractice.isGoodDog(2, 1, true));
        assertEquals(false, FunctionPractice.isGoodDog(3, 0, false));
    }
    
}
