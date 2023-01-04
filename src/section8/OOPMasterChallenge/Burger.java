package section8.OOPMasterChallenge;

public class Burger {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Burger() {
        this(new Burger(), new Drink(), new SideItem());
    }

    public Burger(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }
}
