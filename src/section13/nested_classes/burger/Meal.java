package section13.nested_classes.burger;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionPrice;

    public Meal() {
        this(1);
    }

    public Meal(double conversionPrice){
        this.conversionPrice=conversionPrice;
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal(){
        double total = burger.getPrice()+drink.price+side.price;
        return Item.getPrice(total,conversionPrice);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    public void addToppings(String... selectedToppings){
        burger.addToppings(selectedToppings);
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

    private class Burger extends Item{

        private enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;

            private double getPrice(){
                return switch (this){
                    case AVOCADO -> 1.0;
                    case BACON, CHEESE -> 1.5;
                    default -> 0;
                };
            }

        }

        private List<Item> toppings = new ArrayList<>();

        Burger(String name){
            super(name, "burger", 5.0);
        }

        public double getPrice(){
            double total =super.price;
            total += toppings.stream()
                    .mapToDouble(topping -> topping.price)
                    .sum();
            return total;
        }

        private void addToppings(String... selectedToppings){
            for (String selectedTopping : selectedToppings){
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                }catch (IllegalArgumentException ie){
                    System.out.println("No topping found for "+selectedTopping);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            toppings.forEach(topping->{
                itemized.append("\n").append(topping);
            });

            return itemized.toString();
        }
    }
}
