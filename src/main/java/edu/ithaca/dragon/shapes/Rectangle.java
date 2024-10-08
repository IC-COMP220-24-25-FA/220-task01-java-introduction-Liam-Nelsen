package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       double area = this.length * this.width;

       return area;
    }

    public void doubleSize(){
        this.length *= 2;
        this.width *= 2;
    }

    public double longestLineWithin(){
        double longestLine = Math.sqrt((this.width * this.width) + (this.length * this.length));

        return longestLine;
    }

    public String toString(){
        return "This is a rectangle with a length of " + length + " and a width of " + width;
    }
    
}
