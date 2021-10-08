package lesson3.syntax;

public class Floats {

    private static final float PI = 3.14f;

    public static void main(String[] args) {
        /* final float PI = 3.14f;*/
        float radius = 5.5f;
        double diameter = 28.123d;

        float result = circlePerimeter(radius);
        System.out.println("When radius is " + radius + " then perimeter is " + result);
        System.out.println("When radius is " + radius + " then area  is " + circleArea(radius));

    }

    static float circlePerimeter(float radius){
        return 2* PI * radius;
    }
    static float circleArea (float radius){
        return PI * radius * radius;
    }
}
