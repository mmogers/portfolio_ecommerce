package lesson4;

public class Arrays {
    public static void main(String[] args) {
        //define an array
        int[] arrayOfIntegers;

        //Initialize the array
        arrayOfIntegers = new int[5];

        //same in one line
        int[] anotherArray = new int[10];

        System.out.println(initAlphabet());

        //Define the array and initialise using shorthand notation
        String[] cities = {"Riga", "London", "Paris"};

        // This is equial to
        String[] cities2 = new String[3];
        cities[0] = "Tokyo";
        cities[1] = "Los Angeles";
        cities[1] = "Singapour";


        System.arraycopy(cities, 0, cities2, 0, cities.length);
//copy from cities to cities2????????????????????????
        for (String city :
                cities2) {
            System.out.println(city + ",");
        }

        //TWO DIMENSIONAL ARRAYS
        int[][] points = new int[10][10];

        points[0][0] = 99;
        points[0][1] = 5;

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(points[i][j] + " ");
            }

        }

    }

    static char[] initAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);// casting from integer to char
        }
        return alphabet;
    }
}
