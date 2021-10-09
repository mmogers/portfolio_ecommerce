package lesson4;
public class ThirdMaximum2 {
    public static void main(String[] args) {
        int [] array = {2,2,3,1};
        //int [] array = {1};
        int min = array[0];
        for (int item:array //finds min in the array
             ) {
            if(min > item){
                min = item;
            }
        }
        //initialize all to min
        int max1 = min;
        int max2 = min;
        int max3 = min;

        for (int item:array //this for loop will shift maximums from 1 to 2 , from 2 to 3, and max into max
             ) {
            if (item > max1 ){
                max3 = max2;
                max2 = max1;
                max1 = item;
            }
            if (item > max2 && item < max1){
                max3 = max2;
                max2 = item;
            }
            if (item > max3 && item < max2){
                max3 = item;
            }
        }
        //System.out.println(max1 +" " + max2 + " " + max3);
        if (max2 == max3){
            System.out.println("There is no third maximun, The maximum is: " + max1);
        }else {
            System.out.println("The third maximum in the array is: " + max3);
        }
    }
}
