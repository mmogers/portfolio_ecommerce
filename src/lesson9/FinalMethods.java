package lesson9;

public class FinalMethods {
    //initialized during declaration
    final int CONSTANT_PI = 3;
    private int someVar;


    //INITIALIZING NOT INITIALIZED CONSTANTS - IN CONSTRUCTORS,
    // not initialized during declaration
    final int CONSTANT_NOINIT;

    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar, int CONSTANT_NOINIT) {
        this.someVar = someVar;
        this.CONSTANT_NOINIT = CONSTANT_NOINIT;
    }

    public final void printHello() {
        System.out.println("Hello");
    }


}

//FINAL METHODS CANNOT BE OVERRIDEN
class ExtendedFinalMethods extends FinalMethods {
    //@Override
    // public void printHello(){
    //   System.out.println("Hi");
    //}
}