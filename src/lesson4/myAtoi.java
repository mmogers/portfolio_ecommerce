package lesson4;

public class myAtoi {

    public static void main(String[] args) {
        String string = "   -256";
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' ');
            counter ++;
        }
        boolean isNegative = false;
        if(string.charAt(counter) == '-'){ //detects +/- sets if the number is negative or positive
            isNegative = true;
            counter++;
        }else if (string.charAt(counter) == '+'){
            isNegative = false;
            counter++;
        }
        for (int i = counter; i <string.length() ; i++) { //eliminates zeroes
            if(string.charAt(i) == '0'){
                counter++;
            }else {
                break;
            }
        }
        int power = 0;
      // while()


    }
}
