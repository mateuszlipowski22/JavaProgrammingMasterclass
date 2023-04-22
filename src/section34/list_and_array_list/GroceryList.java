package section34.list_and_array_list;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem ,String newItem) {
        int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String newItem) {
        int position = findItem(newItem);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String itemToSearch) {
            return groceryList.indexOf(itemToSearch);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
