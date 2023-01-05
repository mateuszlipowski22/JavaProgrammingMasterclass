package section8.billsBurgers;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    // public void printInfo() {
    //     System.out.printf("Healthy hamburger on a %s roll with %s, price is %.2f %n", breadRollType, meat, price);
    // }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() +
                ((healthyExtra1Name==null) ? 0 : healthyExtra1Price) +
                ((healthyExtra2Name==null) ? 0 : healthyExtra2Price);
    }

    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }


}
