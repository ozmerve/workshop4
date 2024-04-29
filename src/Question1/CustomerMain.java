package Question1;

import Question1.Customer;

import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers = customerManager.getAll();

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setFirstName("Ayşegül");
        customer1.setLastName("Öz");
        customer1.setEmail("a.oz@gmail.com");
        customer1.setPassword("123456");
        customer1.setPhoneNumber("Analysis");
        customer1.setAdddress("Ankara");

        customerManager.add(customer1);

        for (Customer customer : customers) {
            System.out.println("Kayıt olan Müşterinin Adı ve Soyadı : " +
                    customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Email bilgisi : " + customer.getEmail());
            System.out.println("Telefon Numarası : " + customer.getPhoneNumber());
            System.out.println("Sisteme kayıt tarihi : " + customer.getCreatedDate());
        }

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        customer1.setAdddress("İstanbul");
        customerManager.update(customer1);
        System.out.println(customer1.getFirstName() + " " + customer1.getLastName() + " adresi: "
                +customer1.getAdddress() );
        System.out.println("Güncelleme tarihi : " + customer1.getUpdatedDate());


        System.out.println("---------------------------------");
        System.out.println("DELETE İŞLEMİ\n");

        /*customerManager.delete(2);
        for (Question1.Customer customer : customers)
        {
            System.out.println(customer.getFirstName() +" " + customer.getLastName() + " Address: "
            +customer.getAdddress() + " Telefon No: " + customer.getPhoneNumber()
                    + " id: " + customer.getId());
        }*/
    }
}
