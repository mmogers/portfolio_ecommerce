package lesson4;

import java.util.List;
import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number.");
        int intNumber = scanner.nextInt();
        while ((intNumber>3999 || intNumber<1)){ //wait for the input of int number in a range [1-3999]
            System.out.println("The number is out of range. Enter the number in the range [1-3999] ");
            intNumber = scanner.nextInt();
        }

        int unitsDigit = 0; //the
        int tensDigit = 0;
        int hundredsDigit = 0;
        int thousandsDigit = 0;
        int unitsGrade = 1;
        int tensGrade = 10;
        int hundredsGrade = 100;
        int thousandsGrade = 1000;
if (intNumber < 10){
    unitsDigit = intNumber % 10;
    String numUnits = romanNumberCreator(unitsDigit,unitsGrade);
    System.out.println(numUnits);
}
else if(intNumber < 100){
    unitsDigit = intNumber % 10;
    tensDigit = intNumber / 10;
    String numUnits = romanNumberCreator(unitsDigit,unitsGrade);
    String numTens = romanNumberCreator(tensDigit,tensGrade);
    System.out.println(numTens + numUnits);
}
else if(intNumber < 1000){
    unitsDigit = intNumber % 10;
    tensDigit = (intNumber / 10) % 10;
    hundredsDigit = intNumber / 100;
    String numUnits = romanNumberCreator(unitsDigit,unitsGrade);
    String numTens = romanNumberCreator(tensDigit,tensGrade);
    String numHundreds = romanNumberCreator(hundredsDigit,hundredsGrade);
    System.out.println(numHundreds + numTens + numUnits);
}
else {
    unitsDigit = intNumber % 10;
    tensDigit = (intNumber / 10) % 10;
    hundredsDigit = (intNumber / 100) %10;
    thousandsDigit = intNumber / 1000;
    String numUnits = romanNumberCreator(unitsDigit,unitsGrade);
    String numTens = romanNumberCreator(tensDigit,tensGrade);
    String numHundreds = romanNumberCreator(hundredsDigit,hundredsGrade);
    String numThousands = romanNumberCreator(thousandsDigit,thousandsGrade);
    System.out.println(numThousands + numHundreds + numTens + numUnits);
}

    }

    static String romanNumberCreator (int number, int grade){
        char a = ' ';
        char b = ' ';
        char c = ' ';

        if(grade == 1) {
            a = 'I';
            b = 'V';
            c = 'X';
        }else if (grade == 10){
            a = 'X';
            b = 'L';
            c = 'C';
        }else if (grade == 100){
            a = 'C';
            b = 'D';
            c = 'M';
        }else if (grade == 1000){
            a = 'M';
            b = ' ';
            c = ' ';

        }

        char [] romanNumber = {};

switch (number){
    case 1:
        romanNumber = new char []{a};
        break;

    case 2:
        romanNumber = new char [] {a,a};
        break;
    case 3:
        romanNumber = new char [] {a, a, a};
        break;
    case 4:
        romanNumber = new char [] {a,b};
        break;
    case 5:
        romanNumber = new char [] {b};
        break;
    case 6:
        romanNumber = new char [] {b, a};
        break;
    case 7:
        romanNumber = new char [] {b, a, a};
        break;
    case 8:
        romanNumber = new char [] {b, a, a, a};
        break;
    case 9:
        romanNumber = new char [] {a,c};
        break;
    default:
       break;
}
        String stringRomanNumber  = new String(romanNumber);
       // System.out.println(stringRomanNumber);
return stringRomanNumber;
    }
}
