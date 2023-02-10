package section11.abstract_class_challenge_update;

public class OrderItem {

    public OrderItem(int quantity, ProductForSale productForSale) {
        this.quantity = quantity;
        this.productForSale = productForSale;
    }

    private int quantity;
    private ProductForSale productForSale;
}
