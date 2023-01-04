package section8.OOPMasterChallenge;

public class SideItem {

    private String type;
    private int price;

    public SideItem() {
        this("Fries", 10);
    }

    public SideItem(String type, int price) {
        this.type = type;
        this.price = price;
    }
}
