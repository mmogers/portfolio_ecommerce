package lesson3.syntax;

public class Conditionals {

    public static void main(String[] args) {
        //a method that decides weather the number is odd or even
        System.out.println(oddOrEven(6));
        System.out.println(oddOrEven2(7));

    }

    /**
     * oddOrEven method finds out if the provided number is odd or even
     * @param number - number we want to check
     * @return string "odd" if the number is odd and "even"
     * if the number is even
     */
    public static String oddOrEven(int number){
        if (number % 2 == 0){
            return "even";
        }
        else return "odd";
    }

    /**
     * oddOrEven2 method finds out if the provided number is odd or even in short way
     * @param number number we want to check
     * @return string "odd" if the number is odd and "even"
     * if the number is even
     */
    public static String oddOrEven2(int number){
        return number % 2 == 0 ? "even": "odd";
    }
}
