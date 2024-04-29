package Question1;

public class Customer extends User {

    private String phoneNumber;

    private String adddress;

    public Customer(){

    }

    public Customer(String phoneNumber, String adddress ) {
        this.phoneNumber = phoneNumber;
        this.adddress = adddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

}
