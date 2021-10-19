package lesson8;

/**
 * calculates and prints the area and the perimeter of the rectangle
 */
public class Rectangle extends Shape{
    protected double length;
    private double breadth;

    //for task 6
    public void printHelloMessageRectangle (){
        System.out.println("This is rectangular shape");
    }
   public void printPerimeter (){
       System.out.println("The perimeter is: " + 2*(length+breadth) );
   }
    public void printArea (){
        System.out.println("The area is: " + length*breadth);
    }
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

}
