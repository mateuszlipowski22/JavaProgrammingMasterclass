package section8.billsBurgers;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

//    public void printWarning(){
//        System.out.println("Cannot not add additional items to a deluxe burger");
//    }

//    @Override
//    public void printInfo() {
//        System.out.printf("Deluxe hamburger on a %s roll with %s & Bacon, price is %.2f %n", breadRollType, meat, price);
//    }
}
