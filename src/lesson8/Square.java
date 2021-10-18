package lesson8;


public class Square extends Rectangle {

    @Override
    public double getLength() {
        return super.getLength();
    }
    public void printPerimeter (){
        System.out.println("The square perimeter is: " + 4*getLength() );
    }
    public void printArea (){
        System.out.println("The square area is: " + (getLength())*getLength());
    }
}
