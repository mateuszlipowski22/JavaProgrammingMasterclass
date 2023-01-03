package section8.polymorphismChallenge;

public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
    }
}
