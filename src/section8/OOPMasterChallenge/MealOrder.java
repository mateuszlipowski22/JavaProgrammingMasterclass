package section8.OOPMasterChallenge;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String itemType, String sideType) {
        this.burger = new Burger(burgerType, 4);
        this.drink = new Item("drink",itemType, 1.00 );
        this.side = new Item("side",sideType, 1.50 );
    }

    public double getTotalPrice(){
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

}
