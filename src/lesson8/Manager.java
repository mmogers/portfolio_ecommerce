package lesson8;

public class Manager extends Member{
    private String specialization;
    private String department;


    public Manager() {
    }

    public Manager(String specialization, String department) {
        this.specialization = specialization;
        this.department = department;
    }

    public Manager(String name, int age, String phoneNumber, String address, double salary) {
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
