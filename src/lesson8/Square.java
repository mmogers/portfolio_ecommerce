package lesson8;

/**
 * Square extends rectangle and calculates and prints an area and perimeter of
 * calculateSquareArea - returns double - area of the square
 * the square using methods overridden from rectangle
 */
public class Square extends Rectangle {

/*    @Override
    public double getLength() {
        return super.getLength();
    }*/

    public double calculateSquareArea(){
        return length*length;
    }

    public void printPerimeter (){
    System.out.println("The perimeter of the square is: " + 4*(length) );
    }
    public void printArea (){
        System.out.println("The area of the square is: " + length*length);
    }

    public Square() {
    }

    public Square(double length, double breadth) {
        super(length, breadth);
    }
}
