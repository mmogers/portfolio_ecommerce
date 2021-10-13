package lesson5.bank;

public class LectureSlides {
    //private static Object IntegerTypeSample;

    public static void main(String[] args) {
        IntegerTypeSample sample = new IntegerTypeSample();
        sample.f(217L);
        sample.f(217);
        short x1 = (short) 217;
        sample.f(x1);
        byte x2 = (byte) 217;
        sample.f(x2);
    }
}
class IntegerTypeSample{
public void f(long x){
    System.out.println("long argument " + x);
}
    public void f(int x){
        System.out.println("int argument " + x);
    }
    public void f(short x){
        System.out.println("short argument " + x);
    }
    public void f(byte x){
        System.out.println("byte argument " + x);
    }
}
