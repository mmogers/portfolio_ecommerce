package lesson4;

public class References {

    public static void main(String[] args) {
        //THIS WILL POINT TO NULL
        String someString;

        //THESE TWO LINES ARE IDENTICAL
        someString = "Something";
        someString = new String("Something");

        Point point1 = new Point(7,11);
        System.out.println("Coordinates Point 1 : " + point1.getX() + " " + point1.getY());
        Point point3 = new Point();
        Point point2 = point1;
        System.out.println("Coordinates Point 2 : " + point2.getX() + " " + point2.getY());

        point3.setX(point1.getX());
        point3.setY(point1.getY());

        System.out.println("Coordinates Point 3 : " + point3.getX() + " " + point3.getY());

        point2.setX(100);
        System.out.println("Coordinates Point 1 : " + point1.getX() + " " + point1.getY());
        System.out.println("Coordinates Point 2 : " + point2.getX() + " " + point2.getY());
        System.out.println("Coordinates Point 3 : " + point3.getX() + " " + point3.getY());



    }


}

class Point {
    //coordinates
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}