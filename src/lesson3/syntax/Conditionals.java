package lesson3.syntax;

public class Conditionals {

    public static void main(String[] args) {
        //a method that decides weather the number is odd or even
        System.out.println(oddOrEven(6));
        System.out.println(oddOreven2(7));

    }

    public static String oddOrEven(int number){
        if (number % 2 == 0){
            return "even";
        }
        else return "odd";
    }
    public static String oddOreven2(int number){
        return number % 2 == 0 ? "even": "odd";
    }
}
