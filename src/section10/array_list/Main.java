package section10.array_list;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d, %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0]=new GroceryItem("milk");
        groceryArray[1]=new GroceryItem("apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("oranges", "Produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges"));
        System.out.println(groceryList);

        groceryList.set(0, new GroceryItem("apples"));
        System.out.println(groceryList);

        groceryList.remove(1);
        System.out.println(groceryList);
    }

}
