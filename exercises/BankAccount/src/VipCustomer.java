public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name", 1000, "Default Email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown" );
    }

    public VipCustomer(String name, double creditLimit, String email) {
        System.out.println("VIP Customer Constructor");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
