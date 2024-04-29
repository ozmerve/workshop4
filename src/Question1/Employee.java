package Question1;

public class Employee extends User {
    private String department;


    public Employee(){

    }

    public Employee(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}