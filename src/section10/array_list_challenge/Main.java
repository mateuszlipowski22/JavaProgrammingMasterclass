package section10.array_list_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d, %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();

        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean flag = true;
        while (flag) {
            System.out.printf("""
                    Available actions
                    0 - shutdown
                    1 - add item(s) to list (comma delimited list)
                    2 - remove item(s) to list (comma delimited list)
                    """);

            userChoice = scanner.nextLine();
            switch (Integer.parseInt(userChoice)) {
                case 0 -> {
                    flag = false;
                }
                case 1 -> {
                    System.out.printf("""
                    Type new product
                    """);
                    String[] newItems = scanner.nextLine().split(",");
                    Arrays.stream(newItems).forEach(element -> {
                        GroceryItem newItem = new GroceryItem(element.trim());
                        if (!groceryList.contains(newItem)) {
                            groceryList.add(newItem);
                        }
                    });
                }
                case 2 -> {
                    System.out.printf("""
                    Input product to remove from the list
                    """);
                    String[] newItems = scanner.nextLine().split(",");
                    Arrays.stream(newItems).forEach(element -> {
                        GroceryItem itemToRemove = new GroceryItem(element.trim());
                        groceryList.remove(itemToRemove);
                    });
                }
            }
            groceryList.sort(Comparator.comparing(GroceryItem::name));
            System.out.println(groceryList);
        }
    }

}
