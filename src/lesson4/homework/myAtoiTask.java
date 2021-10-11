//think its done
package lesson4.homework;

public class myAtoiTask {

    public static void main(String[] args) {
        String string = "   -22323232323232323232323"; //a string for example
        System.out.println(myAtoi(string));
    }

    /**
     * myAtoi method converts string to integer, using the following algorithm:
     * 1. Read in and ignore any leading whitespace.
     * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     * 3.Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
     * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     * 5 If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
     * 6.Return the integer as the final result.
     * @param s - a  string
     * @return number (integer)
     */
    static int myAtoi(String s){
        s = s.trim(); //1. Read in and ignore any leading whitespace.

        //detects if there is +/- and sets if the number is negative or positive,
        // if no sing - positive by default
        int counter = 0;
        boolean isNegative = false;
        if(s.charAt(counter) == '-'){
            isNegative = true;
            counter++;
        }else if (s.charAt(counter) == '+'){
            isNegative = false;
            counter++;
        }

        //eliminates zeroes, moves pointer to char further
        for (int i = counter; i <s.length() ; i++) {
            if(s.charAt(i) == '0'){
                counter++;
            }else {
                break;
            }
        }

        // get the number by multiplying it to 10 and adding next digit a = (a*10 + next digit) * 10 + next digit...
        long  number = 0;
        while (((int)(s.charAt(counter)) <= '9') &&((int)(s.charAt(counter)) >= '0')){
            number = number * 10 + ((int)s.charAt(counter) - (int)'0'); // number = ascii(number) - asci (0)
            counter++; // moves the pointer to the next char in string
            //System.out.println(number + " number creation " + counter);
            if (number >= (long)Math.pow(2,31)){ //checks if its in range 2 in pow 31, and updates the number if yes
                System.out.println( number + (long)Math.pow(2,31) + " 2 v 31");
                break;
            }
            if (counter >= s.length()){ //not to get out of memory in the next iteration
                break;
            }
        }

        //checks the sign, if negative sets to (0-number)
        number  = isNegative ? 0-number : number;
        return (int)number;
    }
}
