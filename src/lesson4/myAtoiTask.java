//think its done
package lesson4;

public class myAtoiTask {

    public static void main(String[] args) {
        String string = " -234g dsgas";
        myAtoi(string);
    }

    static void myAtoi(String s){
        s = s.trim(); //removes leading spaces

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
            //System.out.println(number);

            if (number > Math.pow(2,31)){ //checks if its in range 2 in pow 31, and updates the number if yes
                number = (long)Math.pow(2,31);
                break;
            }
            if (counter >= s.length()){ //not to get out of memory in the next iteration
                break;
            }
        }
        //checks the sign, if negative sets to 0-number
        number  = isNegative ? 0-number : number;
        System.out.println(number);
    }
}
