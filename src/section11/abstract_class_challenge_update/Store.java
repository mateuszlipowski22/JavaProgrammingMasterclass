package section11.abstract_class_challenge_update;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale productForSale) {
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("oil painting", 1350, "Impressionistic work by ABF painted in 2009"));
        storeProducts.add(new ArtObject("sculpture", 2000, "Bronze work by JKF produced in 1950"));
        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));


        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 2, 5);
        addItemToOrder(order2, 0, 2);
        addItemToOrder(order2, 3, 1);
        printOrder(order2);

    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.productForSale().printPricedLine(item.qty());
            salesTotal += item.productForSale().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
