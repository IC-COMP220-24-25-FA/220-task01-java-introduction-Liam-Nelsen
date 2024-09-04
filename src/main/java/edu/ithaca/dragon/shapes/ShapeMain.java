package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args){
        Random random = new Random();

        List<Shape> list1 = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++){
            int randShape = random.nextInt(3 - 1 + 1) + 1;
            
            if (randShape == 1){
                int randCircle = random.nextInt(10 - 1 + 1) + 1;
                Circle circleToAdd = new Circle(randCircle);
                list1.add(circleToAdd);
                System.out.println(list1.get(i));

                circleToAdd.doubleSize();
            } else if (randShape == 2){
                int randRectWidth = random.nextInt(10 - 1 + 1) + 1;
                int randRectLength = random.nextInt(10 - 1 + 1) + 1;
                Rectangle rectToAdd = new Rectangle(randRectWidth, randRectLength);
                list1.add(rectToAdd);
                System.out.println(list1.get(i));

                rectToAdd.doubleSize();
            } else {
                int randTriBase = random.nextInt(10 - 1 + 1) + 1;
                int randTriHeight = random.nextInt(10 - 1 + 1) + 1;
                Triangle triToAdd = new Triangle(randTriBase, randTriHeight);
                list1.add(triToAdd);
                System.out.println(list1.get(i));

                triToAdd.doubleSize();
            }
        }

        System.out.println("\nList after doubling: ");
        
        for(Shape shape : list1){
            System.out.println(shape);
        }
        System.out.println("");

        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        
        ArrayList <Rectangle> myRectangles = new ArrayList<Rectangle>();

        Rectangle myRectangle1 = new Rectangle((Math.random() * 21), (Math.random() * 21));
        Rectangle myRectangle2 = new Rectangle((Math.random() * 21), (Math.random() * 21));
        Rectangle myRectangle3 = new Rectangle((Math.random() * 21), (Math.random() * 21));
        Rectangle myRectangle4 = new Rectangle((Math.random() * 21), (Math.random() * 21));
        Rectangle myRectangle5 = new Rectangle((Math.random() * 21), (Math.random() * 21));

        myRectangles.add(myRectangle1);
        myRectangles.add(myRectangle2);
        myRectangles.add(myRectangle3);
        myRectangles.add(myRectangle4);
        myRectangles.add(myRectangle5);

        for (int i = 0; i < myRectangles.size(); i++){
            int j = i+1;
            System.out.println("The area of rectangle " + j + " is " + myRectangles.get(i).calcArea());
            System.out.println("The longest line withing rectangle " + j + " is " + myRectangles.get(i).longestLineWithin() + "\n");
        }

        for (int j = 0; j < 5; j++){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter a rectangle number to double the size of (Enter 1-5): ");
            String rectInput = myScanner.nextLine();

            int userChoice = Integer.parseInt(rectInput);
            System.out.println("Doubling rectangle " + rectInput + "..." + "\n");

            myRectangles.get(userChoice - 1).doubleSize();
            //System.out.println(myRectangles.get(userChoice - 1).calcArea());
            //System.out.println(myRectangles.get(userChoice - 1).longestLineWithin());

            System.out.println("Here is the updated list of all rectangles:" + "\n");
            for (int k = 0; k < myRectangles.size(); k++){
                int l = k+1;
                System.out.println("The area of rectangle " + l + " is " + myRectangles.get(k).calcArea());
                System.out.println("The longest line withing rectangle " + l + " is " + myRectangles.get(k).longestLineWithin() + "\n");
            }
        }
    }
}
