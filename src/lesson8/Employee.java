package lesson8;

/**
 * extends member, adds 2 more fields
 */
public class Employee extends Member{
    private String specialization;
    private String department;

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
