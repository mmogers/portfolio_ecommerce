package lesson4.homework;

import java.util.Scanner;


public class RomanNumerals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //asks from user a number in the range [1,3999] until he enters the correct one
        System.out.println("Please enter the number.");
        int intNumber = scanner.nextInt();
        while ((intNumber > 3999 || intNumber < 1)) { //wait for the input of int number in a range [1,3999]
            System.out.println("The number is out of range. Enter the number in the range [1,3999] ");
            intNumber = scanner.nextInt();
        }
        romanNumeralsConverter(intNumber);

    }

    /**
     * the method converts integers in a range [1,3999] to roman numbers
     * @param intNumber - integer number that belongs to [1,3999]
     */
    static void romanNumeralsConverter(int intNumber) {
        //initializes powers of ten
        int unitsGrade = 1;
        int tensGrade = 10;
        int hundredsGrade = 100;
        int thousandsGrade = 1000;

        //splits the number into digits- units, tens, hundreds and thousands
        int unitsDigit = intNumber % 10;
        int tensDigit = (intNumber / 10) % 10;
        int hundredsDigit = (intNumber / 100) % 10;
        int thousandsDigit = intNumber / 1000;

        //prints out roman number as string starting from left to right from thousands till units,
        //if some digit equals to zero - skips it
        if (thousandsDigit != 0) {
            String numThousands = romanDigitCreator(thousandsDigit, thousandsGrade);
            System.out.print(numThousands);
        }
        if (hundredsDigit != 0) {
            String numHundreds = romanDigitCreator(hundredsDigit, hundredsGrade);
            System.out.print(numHundreds);
        }
        if (tensDigit != 0) {
            String numTens = romanDigitCreator(tensDigit, tensGrade);
            System.out.print(numTens);
        }
        if (unitsDigit != 0) {
            String numUnits = romanDigitCreator(unitsDigit, unitsGrade);
            System.out.print(numUnits);
        }
    }

    /**
     * the method converts a single integer digit to roman number according to its 10th power
     * for example 3 = 3*10 in pow 0 -> the method receives 3 and 1 -> III
     * for example 30 = 3*10 in pow 1 -> the method receives 3 and 10 -> XXX
     * for example 300 = 3*100 -> the method receives 3 and 100 ->CCC
     * for example 3000 = 3*1000 -> the method receives 3 and 1000 ->MMM
     * @param number number divided to its ten's power (for example: 3 = 300/100)
     * @param grade ten's power 1, 10, 100 or 1000
     * @return roman number as string
     */
    static String romanDigitCreator(int number, int grade) {
        //declaring
        char a = ' '; //1*10^0, 1*10^1, 1*10^2, 1*10^3 (1 multiplied by power of 10)
        char b = ' '; //5*10^0, 5*10^1, 5*10^2, 5*10^3 (5 multiplied by power of 10)
        char c = ' '; //10*10^0, 10*10^1, 10*10^2(10 multiplied by power of 10)

        if (grade == 1) { //characters needed for creation of units 1-9, numbers: 1,2,...,9
            a = 'I';
            b = 'V';
            c = 'X';
        } else if (grade == 10) { //characters needed for creation of tens- (1-9)*10, numbers: 10,20,...,90
            a = 'X';
            b = 'L';
            c = 'C';
        } else if (grade == 100) {//characters needed for creation of hundreds (1-9)*100, numbers: 100,200,,,,900
            a = 'C';
            b = 'D';
            c = 'M';
        } else if (grade == 1000) {//characters needed for creation of thousands (1-3)*1000 numbers 1000,2000,3000
            a = 'M';
            b = ' ';
            c = ' ';

        }

        char[] romanDigit = {};

        //builds the stricture of the roman number from int digit , applies to all powers of ten
        switch (number) {
            case 1:
                romanDigit = new char[]{a};
                break;
            case 2:
                romanDigit = new char[]{a, a};
                break;
            case 3:
                romanDigit = new char[]{a, a, a};
                break;
            case 4:
                romanDigit = new char[]{a, b};
                break;
            case 5:
                romanDigit = new char[]{b};
                break;
            case 6:
                romanDigit = new char[]{b, a};
                break;
            case 7:
                romanDigit = new char[]{b, a, a};
                break;
            case 8:
                romanDigit = new char[]{b, a, a, a};
                break;
            case 9:
                romanDigit = new char[]{a, c};
                break;
            default:
                break;
        }
        return String.valueOf(romanDigit);
    }
}
