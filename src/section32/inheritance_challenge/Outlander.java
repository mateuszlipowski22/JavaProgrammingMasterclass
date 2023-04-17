package section32.inheritance_challenge;

public class Outlander extends Car{

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 4, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
