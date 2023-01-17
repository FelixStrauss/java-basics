public class Customer {

    private String firstName;
    private String lastName;
    private String homeAdress;

    public Customer(String firstName, String lastName, String homeAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAdress = homeAdress;
        

    }
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }

    public String gethomeAdress() {
        return homeAdress;
    }
    public void setTitle(String firstName) {
        this.firstName = firstName;
    }

    public void setAuthor(String lastName) {
        this.lastName = lastName;
    }

    public void sethomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }
}
