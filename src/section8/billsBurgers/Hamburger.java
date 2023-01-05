package section8.billsBurgers;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String  breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.printf("Basic hamburger on a %s roll with %s, price is %.2f %n",breadRollType,meat,price);
    }

    public void addHamburgerAddition1(String additionName, double additionPrice){
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }

    public void addHamburgerAddition2(String additionName, double additionPrice){
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }

    public void addHamburgerAddition3(String additionName, double additionPrice){
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }

    public void addHamburgerAddition4(String additionName, double additionPrice){
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
        System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    }


    public double itemizeHamburger() {
        return price+
                ((addition1Name==null) ? 0 : addition1Price) +
                ((addition2Name==null) ? 0 : addition2Price) +
                ((addition3Name==null) ? 0 : addition3Price) +
                ((addition4Name==null) ? 0 : addition4Price);
    }

    // public void printAdditionInfo(String additionName, double additionPrice){
    //     System.out.printf("Added %s for an extra %.2f %n",additionName,additionPrice);
    // }

    // public void printInfo(){
    //     System.out.printf("Basic hamburger on a %s roll with %s, price is %.2f %n",breadRollType,meat,price);
    // }
}
