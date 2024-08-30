package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        
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
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
    }
}
