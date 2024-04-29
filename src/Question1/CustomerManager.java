package Question1;

import Question1.Customer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager(){
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Zeynep");
        customer.setLastName("Öz");
        customer.setEmail("z.oz@hotmail.com");
        customer.setPassword("123456");
        customer.setPhoneNumber("5555555555");
        customer.setAdddress("Pamukkale/Denizli");
        customer.setCreatedDate(LocalDateTime.now());

        customers.add(customer);
    }

    public List<Customer> getAll(){
        return customers;
    }

    public void add(Customer customer){
        customer.setCreatedDate(LocalDateTime.now());
        customers.add(customer);
    }

    public void update(Customer customer){
        for (Customer updateStudent : customers){
            if (updateStudent.getId()==customer.getId())
            {
                updateStudent.setPhoneNumber(customer.getPhoneNumber());
                customer.setUpdatedDate(LocalDateTime.now());
            }
        }
    }

    public void delete(int id) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id)
            {
                iterator.remove();
                customer.setDeletedDate(LocalDateTime.now());
                System.out.println( "FirstName: "+   customer.getFirstName() + " LastName: "
                        + customer.getLastName()  + " Silinme saati: " + customer.getDeletedDate()
                        + " Silinen çalışan: " + customer.getFirstName());
            }
        }
    }

}