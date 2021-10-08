package lesson3.syntax;

public class Casts {
    public static void main(String[] args) {
        int justAnInteger = 50000;
        System.out.println(justAnInteger);
        System.out.println((long) justAnInteger);
        System.out.println((short) justAnInteger);//can lead to mistake -15536
        if(justAnInteger>32000 || justAnInteger < -32000){
            System.out.println(justAnInteger);
        }else{
            System.out.println((short) justAnInteger);
        }

        System.out.println("Just a PI: "+ (int)3.14f);
    }
}
