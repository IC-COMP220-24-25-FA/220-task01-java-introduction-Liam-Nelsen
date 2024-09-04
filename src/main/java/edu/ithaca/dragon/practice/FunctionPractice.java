package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int largest;

        if (first > second){
            largest = first;
        } else {
            largest = second;
        }

        if (third > largest){
            largest = third;
        }


        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("A number or numbers cannot be negative");
        }

        return largest;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double discountDecimal = discountPercent / 100;
        double priceOff = originalPrice * discountDecimal;

        return (originalPrice - priceOff) + salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (daysSinceShoesChewed == 0){
            return false;
        }

        if (daysSinceShoesChewed > 0 && fetchedThePaperToday == true){
            return true;
        }

        return true;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){

        if (numbers.size() == 0){
            return -1;
        }

        int largestNum = numbers.get(0);
        int numIndex = 0;

        for (int num : numbers){
            if (num > largestNum) {
                largestNum = num;
                numIndex = numbers.indexOf(num);
            }
        }

        return numIndex;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
