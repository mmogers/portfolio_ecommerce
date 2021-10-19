package lesson8;


public class Square extends Rectangle {

/*    @Override
    public double getLength() {
        return super.getLength();
    }*/
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
