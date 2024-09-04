package edu.ithaca.dragon.shapes;

public class Circle {
    double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = (this.radius * this.radius) * Math.PI;
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter = this.radius + this.radius;

        return diameter;
    }

    public String toString(){
        return "This is a circle with a radius of " + radius;
    }
}
