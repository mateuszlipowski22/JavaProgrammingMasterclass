package section13.nested_classes.burger;

public class Meal {

    private double price = 5.0;
    private Item burger;
    private Item drink;
    private Item side;

    private double conversionPrice;

    public Meal() {
        this(1);
    }

    public Meal(double conversionPrice){
        this.conversionPrice=conversionPrice;
        burger = new Item("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal(){
        double total = burger.price+drink.price+side.price;
        return Item.getPrice(total,conversionPrice);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionPrice));
        }

        private static double getPrice(double price, double rate){
            return price*rate;
        }
    }
}
