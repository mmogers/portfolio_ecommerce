package lesson4;

import java.util.Scanner;

public class ThirdMaximum {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int arrayLength = scanner.nextInt();

        int [] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("please enter the number " + (i+1) + "to array");
            array[i] = scanner.nextInt();
        }

        *//*for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }*/

        int [] array = {1,-5,-7,-1,-2};
       // int [] array = {3,2,1};

        int max = array[0];
      int min = array[0];

        for (int item:array
             ) {
            if (item >= max){
                max = item;
            }
            if (item <=min){
                min = item;
            }
        }
      // System.out.println(max + " " + min);
        int secondMax = min;
        for (int item:array
             ) {
            if(item> secondMax && item < max){
                secondMax = item;
            }
        }


        int thirdMaximum = min;
        for (int item:array
             ) {
            if(item> thirdMaximum && item < secondMax){
                thirdMaximum = item;
            }
        }

      //  System.out.println(max + " " + secondMax + " " + thirdMaximum);
        System.out.println( "The third maximum is: " + thirdMaximum);
    }

}
