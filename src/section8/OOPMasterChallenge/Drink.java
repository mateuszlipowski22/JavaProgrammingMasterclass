package section8.OOPMasterChallenge;

public class Drink {

    private String type;
    private String size;
    private int price;

    public Drink() {
        this("Coke", "small");
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        switch (size.toLowerCase()){
            case "medium" -> this.price = 15;
            case "big" -> this.price = 20;
            default -> this.price = 10;
        }
    }
}
