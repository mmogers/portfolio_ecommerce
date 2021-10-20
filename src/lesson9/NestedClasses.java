package lesson9;

public class NestedClasses {
    //INNER CLASS FOR SECURITY REASONS
    static public class InnerClass{ //NO DEVELOPER WILL USE THIS INNER CLASS
        public String printInnerClass(){
            System.out.println("This is inner class");
            return "Some string returned";
        }
    }

    public String printSmthFromNestedClass(){
        InnerClass inner = new InnerClass();
        inner.printInnerClass();
        return "done";
    }
}

class mainApplication{
    public static void main(String[] args) {
        //possible to enter through
        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();
    }
}