package section32.challenge;

public class VipPerson {

    private String name;
    private double creditLimit;
    private String email;

    public VipPerson() {
        this("Defaule name", 0, "default@wp.pl");
    }

    public VipPerson(double creditLimit, String email) {
        this("Defaule name", creditLimit, email);

    }

    public VipPerson(String name, double creditLimit, String email) {
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
