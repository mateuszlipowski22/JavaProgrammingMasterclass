package section33.OOP_challenge;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizedHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.23);
        hamburger.addHamburgerAddition3("Cheese", 0.56);
        hamburger.addHamburgerAddition4("Ketchup", 0.33);

        System.out.printf("Total hamburger price is %.2f \n", hamburger.itemizedHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.65);
        healthyBurger.addHamburgerAddition1("Tomato", 0.27);
        healthyBurger.addHealthAddition1("Tomato", 0.27);
        healthyBurger.addHealthAddition1("Tomato", 0.27);
        System.out.printf("Total healthy hamburger price is %.2f \n", healthyBurger.itemizedHamburger());

    }

}
