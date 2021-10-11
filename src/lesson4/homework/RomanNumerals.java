package lesson4.homework;
import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number.");
        int intNumber = scanner.nextInt();
        while ((intNumber > 3999 || intNumber < 1)) { //wait for the input of int number in a range [1-3999]
            System.out.println("The number is out of range. Enter the number in the range [1-3999] ");
            intNumber = scanner.nextInt();
        }

        int unitsGrade = 1;
        int tensGrade = 10;
        int hundredsGrade = 100;
        int thousandsGrade = 1000;

        int unitsDigit = intNumber % 10;
        int tensDigit = (intNumber / 10) % 10;
        int hundredsDigit = (intNumber / 100) % 10;
        int thousandsDigit = intNumber / 1000;

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

    static String romanDigitCreator(int number, int grade) {
        char a = ' ';
        char b = ' ';
        char c = ' ';

        if (grade == 1) {
            a = 'I';
            b = 'V';
            c = 'X';
        } else if (grade == 10) {
            a = 'X';
            b = 'L';
            c = 'C';
        } else if (grade == 100) {
            a = 'C';
            b = 'D';
            c = 'M';
        } else if (grade == 1000) {
            a = 'M';
            b = ' ';
            c = ' ';

        }

        char[] romanDigit = {};

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
