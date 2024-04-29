package Question1;

import Question1.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setFirstName("Merve");
        employee.setLastName("Öz");
        employee.setEmail("moz@gmail.com");
        employee.setPassword("123456");
        employee.setDepartment("Analysis");
        employee.setCreatedDate(LocalDateTime.now());

        employees.add(employee);
    }

    public List<Employee> getAll(){
        return employees;
    }

    public void add(Employee employee){
        employee.setCreatedDate(LocalDateTime.now());
        employees.add(employee);
    }

    //update işlemi
    public void update(Employee employee){
        for (Employee updateStudent : employees){
            if (updateStudent.getId()==employee.getId())
            {
                updateStudent.setDepartment(employee.getDepartment());
                employee.setUpdatedDate(LocalDateTime.now());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id)
            {
                iterator.remove();
                employee.setDeletedDate(LocalDateTime.now());
                System.out.println( "FirstName: "+   employee.getFirstName() + " LastName: "
                        + employee.getLastName()  + " Silinme saati: " + employee.getDeletedDate()
                        + " Silinen çalışan: " + employee.getFirstName() + employee.getId());
            }
        }
    }
}