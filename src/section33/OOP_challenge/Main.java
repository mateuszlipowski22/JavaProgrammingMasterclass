package section33.OOP_challenge;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizedHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.23);
        hamburger.addHamburgerAddition3("Cheese", 0.56);
        hamburger.addHamburgerAddition4("Ketchup", 0.33);

        System.out.printf("Total hamburger price is %.2f", hamburger.itemizedHamburger());
    }

}
