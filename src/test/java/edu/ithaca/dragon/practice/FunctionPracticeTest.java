package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void findFirstLargestTest(){
        List<Integer> test1 = new ArrayList<Integer>();
        test1.add(1);
        test1.add(3);
        test1.add(5);
        test1.add(7);
        test1.add(9);

        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(4);
        test2.add(6);
        test2.add(8);
        test2.add(1);
        test2.add(7);

        List<Integer> test3 = new ArrayList<Integer>();
        test3.add(4);
        test3.add(1);
        test3.add(0);
        test3.add(4);
        test3.add(3);

        List<Integer> test4 = new ArrayList<Integer>();

        assertEquals(4, FunctionPractice.findFirstLargest(test1));
        assertEquals(2, FunctionPractice.findFirstLargest(test2));
        assertEquals(0, FunctionPractice.findFirstLargest(test3));
        assertEquals(-1, FunctionPractice.findFirstLargest(test4));
    }

    @Test
    public void findLastLargestTest(){
        List<Integer> test1 = new ArrayList<Integer>();
        test1.add(1);
        test1.add(3);
        test1.add(5);
        test1.add(7);
        test1.add(9);

        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(4);
        test2.add(6);
        test2.add(8);
        test2.add(1);
        test2.add(7);

        List<Integer> test3 = new ArrayList<Integer>();
        test3.add(4);
        test3.add(1);
        test3.add(0);
        test3.add(4);
        test3.add(3);

        List<Integer> test4 = new ArrayList<Integer>();

        assertEquals(4, FunctionPractice.findLastLargest(test1));
        assertEquals(2, FunctionPractice.findLastLargest(test2));
        assertEquals(3, FunctionPractice.findLastLargest(test3));
        assertEquals(-1, FunctionPractice.findLastLargest(test4));
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest (){
        List<String> test1 = new ArrayList<String>();

        test1.add("Watermellon");
        test1.add("Lolipop");
        test1.add("Mercedes");
        test1.add("Racecar");
        test1.add("Zebra");
        test1.add("Computer");


        List<String> test2 = new ArrayList<String>();

        test2.add("Watermellon");
        test2.add("Lolipop");
        test2.add("Mercedes");
        test2.add("Racecar");
        test2.add("Zebra");
        test2.add("Computer");
        test2.add("Mercedes");

        List<String> test3 = new ArrayList<String>();


        assertEquals("mercedes", FunctionPractice.findFirstMostOccurencesOfLetter(test1, 'e'));
        assertEquals("mercedes", FunctionPractice.findFirstMostOccurencesOfLetter(test2, 'e'));
        assertEquals("", FunctionPractice.findFirstMostOccurencesOfLetter(test3, 'e'));
    }
    
}
