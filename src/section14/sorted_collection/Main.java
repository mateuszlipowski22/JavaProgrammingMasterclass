package section14.sorted_collection;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.1, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.40, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.4, 40);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String item : stockList.items().keySet()) {
            System.out.println(item);
        }

        Basket timBasket = new Basket("tim");
        sellItem(timBasket, "car", 1);
        System.out.println(timBasket);

        sellItem(timBasket, "car", 1);
        System.out.println(timBasket);

        if(sellItem(timBasket, "car", 1)!=1){
            System.out.println("There are no more care in stock");
        }
        sellItem(timBasket, "spanner", 5);
        System.out.println(timBasket);

        sellItem(timBasket, "juice", 4);
        sellItem(timBasket, "cup", 12);
        sellItem(timBasket, "bread", 1);
        System.out.println(timBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.items().put(temp.getName(), temp);

        stockList.items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        for(Map.Entry<String,Double> price : stockList.priceList().entrySet()){
            System.out.println(price.getKey()+" cost "+price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We do not sell this " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}

