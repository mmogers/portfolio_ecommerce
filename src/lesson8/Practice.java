package lesson8;

public class Practice {

    public static void main(String[] args) {
        //1-2 task
        /*
        Create a class with a method that prints "This is parent class" and its subclass with another method
        that prints "This is child class". Now, create an object for each of the class and call
        1 - method of parent class by object of parent class
        2 - method of child class by object of child class
        3 - method of parent class by object of child class
        */
        System.out.println("The 1-2 tasks: ");
        ParentClass parentClass = new ParentClass();
        parentClass.printThisIsParentClass();
        ChildClass childClass = new ChildClass();
        childClass.printChildClass();
        childClass.printThisIsParentClass();

        System.out.println();

        //3task
        /*
        Create a class named 'Member' having the following members:
        Data members
        1 - Name
        2 - Age
        3 - Phone number
        4 - Address
        5 - Salary
        It also has a method named 'printSalary' which prints the salary of the members.
        Two classes 'Employee' and 'Manager' inherits the 'Member' class.
        The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
        Now, assign name, age, phone number, address and salary to an employee and a manager by making an object
        of both of these classes and print the same.
         */

        System.out.println("The 3 task: ");
        Employee employee = new Employee("John", 30, "254545454", "Riga, Jurmalas gatve 100", 20000.21);
        Manager manager = new Manager("Jack", 50, "25465987", "Riga, Tallinas iela 24", 252525.25);

        employee.printSalary();
        manager.printSalary();

        System.out.println();

        //4-5tasks
        /*
        4.Create a class named 'Rectangle' with two data members 'length' and 'breadth'
        and two methods to print the area and perimeter of the rectangle respectively.
        Its constructor having parameters for length and breadth is used to initialize length and breadth
        of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter
        for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
        5.Now repeat the above example to print the area of 10 squares.
        Hint-Use array of objects
         */
        System.out.println("The 4-5 tasks: ");
        Rectangle rectangle = new Rectangle(2, 2);
        Square square = new Square(2, 2);

        square.printArea();
        square.printPerimeter();
        rectangle.printArea();
        rectangle.printPerimeter();

        double [] squareSideLengths = {1.1d,2.0d,3,0d,2.211d,5.4d,7.0d,8.0d,6.0d,8.5d,3.3d};
        double areaOf10Squares = 0;
        for (int i = 0; i < 10; i++) {
            Square squareToCalculateArea = new Square(squareSideLengths[i], squareSideLengths[i]);
            areaOf10Squares += squareToCalculateArea.calculateSquareArea();
        }
        System.out.println("The area of 10 squares is: " + areaOf10Squares);

        System.out.println();

        //6task
        /*
        * 6.
        Create a class named 'Shape' with a method to print "This is shape".
        * Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class,
        * both having a method to print "This is rectangular shape" and "This is circular shape" respectively.
        * Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
        * Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
        System.out.println("The 6th task: ");
        square.printHelloMessageShape();
        square.printHelloMessageRectangle();
        square.printHelloMessageSquare();

        System.out.println();

        //7task
        System.out.println("The 7th task: ");
        System.out.println("Author Test: ");
        AuthorTest();
        System.out.println("Test Book: ");
        TestBook();



    }

    public static void AuthorTest() {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);   // call toString() === System.out.println(anAuthor.toString());
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }

    public static void TestBook(){
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 's');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        // Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'), 29.95, 888);
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println("The author name is: " + aBook.getAuthorName());
        System.out.println("The authors mail is: " + aBook.getAuthorEmail());
        System.out.println("The gender of author is: " + aBook.getAuthorGender());
    }
}

