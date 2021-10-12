//think its done
package lesson4.homework;

public class myAtoiTask {

    public static void main(String[] args) {
        String string1 = "1212121212121212"; //range + ->2147483647 - test
        System.out.println(myAtoi(string1));
    }

    /**
     * myAtoi method converts string to integer, using the following algorithm:
     * 1. Read in and ignore any leading whitespace.
     * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     * 3.Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
     * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     * 5 If the integer is out of the 32-bit signed integer range [-2in pow31, 2in pow31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -2 in pow 31 should be clamped to -2in power 31, and integers greater than 2in pow 31 - 1 should be clamped to 2in pow 31 - 1.
     * 6.Return the integer as the final result.
     *
     * @param s - a  string
     * @return number (integer)
     */
    static int myAtoi(String s) {
        //if the string is null->0
        if (s == null){
            return 0;
        }
        s = s.trim(); //1.

        //2. if the end of the string after spaces, or an empty string - "" -> returns (int)0
        if (s.length() == 0) {
            return 0;
        }
        //2. detects if there is +/- and sets if the result will be negative or positive,
        // if no sign -> positive by default
        int counter = 0; //pointer to the place in the string
        boolean isNegative = false; //the number is positive by default
        if (s.charAt(counter) == '-') {
            isNegative = true;
            counter++;
        } else if (s.charAt(counter) == '+') { //is.negative = false; (set by default)
            counter++;
        }

        //3. reads next digits , eliminates zeroes in the beginning
        for (int i = counter; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                counter++;
            } else {
                break;
            }
        }
        //if there are only zeroes in the string ->0
        if (s.length() == counter) {
            return 0;
        }

        // 3. 4. reads non-zero digits from string and calculates the number by multiplying it to 10 and adding next digit
        // using an algorithm : a= 0; a = (a*10 + next digit) * 10 + next digit...
        long number = 0;//long -> the number can be at some point more then (2 in pow 31 -1)

            //the char should be in range of digits[0-9]
        while (((int) (s.charAt(counter)) <= '9') && ((int) (s.charAt(counter)) >= '0')) {
            // number = ascii(number) - ascii (0), the difference is the (int)number
            number = number * 10 + ((int) s.charAt(counter) - (int) '0');
            counter++;

            //5.checks if the received in every iteration number
            // is out of the given range 2 in pow 31 anf if yes -> updates the number  to (2 in 31-1) or to -(2 in 31)
            if (number >= (long) Math.pow(2, 31)-1 && isNegative ==false) {
                number = (long) Math.pow(2, 31)-1;
                return (int) number; //stop , return the positive range number 2 in pow 31 - 1
            }else if (number >= Math.pow(2,31) && isNegative == true){
                number = -(long) Math.pow(2, 31);
                return (int) number; //stop , return the negative range number -(2 in pow 31)
            }
            if (counter >= s.length()) { //not to get out of memory in the next iteration if end of the string
                break;
            }
            //converted number < range

        }
        number = (isNegative) ? -number: number;
        return (int) number; //cast to int
    }
}
