package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calcArea(){
        double area = base * height;

        return area;
    }

    public void doubleSize(){
        base *=2;
        height *=2;
    }

    public double longestLineWithin(){
        if (base > height){
            return base;
        } else {
            return height;
        }
    }

    public String toString(){
        return "This is a triangle with a base of " + base + " and a height of " + height;
    }
}
