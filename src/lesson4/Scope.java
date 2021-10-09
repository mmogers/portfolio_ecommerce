package lesson4;

import java.util.Arrays;

public class Scope {

    static final int SOME_CONSTANT = 314; //everywhere within the class it will be accessible
    static int globalResult = 0; //better not to do like this, we should avoid

    public static void main(String[] args) {
       int someNumber = 99;
       int anotherNumber = SOME_CONSTANT;
// Only thing  - to pass the value as an argument to a method
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);


    }

    static int scopeVisible(int someNumber){
        boolean visibleInsideMethod = true; //not visible from main only inside the method

        return someNumber * 2;
    }

    static  int multiplyByFive (int number){
        int five = 5;

       // globalResult = number * five;
        return number * five;
    }
}
