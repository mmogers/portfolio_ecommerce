package lesson4;

public class myAtoi {

    public static void main(String[] args) {
        String string = "-234";

        myAtoi(string);
    }


    static void myAtoi(String s){
        s = s.trim();
        int counter = 0;
        boolean isNegative = false;
        if(s.charAt(counter) == '-'){ //detects +/- sets if the number is negative or positive
            isNegative = true;
            counter++;
        }else if (s.charAt(counter) == '+'){
            isNegative = false;
            counter++;
        }
        //System.out.println("counter " + counter + " " + isNegative);


        for (int i = counter; i <s.length() ; i++) { //eliminates zeroes
            if(s.charAt(i) == '0'){
                counter++;
            }else {
                break;
            }
        }
        //System.out.println("Zeroes" + counter);
        long  number = 0; //to get the number by multiplying to 10 ND ADDING UNITS
        while (((int)(s.charAt(counter)) <= '9') &&((int)(s.charAt(counter)) >= '0')){ //calculates the number, taking ascii of numbers 48-57
            number = number * 10 + ((int)s.charAt(counter) - 48);
            counter++; // the place in string
            //System.out.println(number);
            if (number > Math.pow(2,31)){ //checks if its in range 2 in pow 31
                number = (long)Math.pow(2,31);
                break;
            }
            if (counter >= s.length()){ //not to get out of memory
                break;
            }
        }

        if (isNegative){ //checks the sign, if negative
            System.out.println((0-number));
        }else{
            System.out.println(number);
        }
    }
}
