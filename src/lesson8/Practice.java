package lesson8;

public class Practice {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.printThisIsParentClass();
        ChildClass childClass = new ChildClass();
        childClass.printChildClass();
        childClass.printThisIsParentClass();



////////////////////////////////////////////////////
    //Now, assign name, age, phone number, address and salary to an employee and a manager
    // by making an object of both of these classes and print the same.

    Employee employee = new Employee("John", 30, "254545454", "Riga, Jurmalas gatve 100", 20000.21);
    Manager manager = new Manager("Jack", 50, "25465987", "Riga, Tallinas iela 24", 252525.25);


        employee.printSalary();
        manager.printSalary();
}
}

