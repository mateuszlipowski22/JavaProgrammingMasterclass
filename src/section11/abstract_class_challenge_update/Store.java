package section11.abstract_class_challenge_update;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

    storeProducts.add(new ArtObject("oil painting", 1350, "Impressionistic work by ABF painted in 2009"));
    storeProducts.add(new ArtObject("sculpture", 2000, "Bronze work by JKF produced in 1950"));

    listProducts();
    }

    public static void listProducts(){
        for(var item:storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

}
