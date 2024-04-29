package Question1;

import Question1.Employee;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees = employeeManager.getAll();


        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFirstName("Özge");
        employee1.setLastName("Öz");
        employee1.setEmail("o.oz@gmail.com");
        employee1.setPassword("123456");
        employee1.setDepartment("Analysis");


        employeeManager.add(employee1);

        for (Employee employee : employees) {
            System.out.println("Kayıt olan çalışanın Adı ve Soyadı : " +
                    employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Email bilgisi : " + employee.getEmail());
            System.out.println("Departmanı : " + employee.getDepartment());
            System.out.println("Sisteme kayıt tarihi : " + employee.getCreatedDate());
        }

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        //employee1.setId(2);
        employee1.setDepartment("Fullstack");
        employeeManager.update(employee1);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " departmanı: "
                +employee1.getDepartment() );
        System.out.println("Güncelleme tarihi : " + employee1.getUpdatedDate());


        /* System.out.println("---------------------------------");
        System.out.println("DELETE İŞLEMİ\n");

        employeeManager.delete(2);
        for (Question1.Employee employee : employees)
        {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " Departman: "
            +employee.getDepartment()
                    + " id: " + employee.getId());
        } */
    }
}
