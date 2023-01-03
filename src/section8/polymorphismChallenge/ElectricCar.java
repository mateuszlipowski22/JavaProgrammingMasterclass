package section8.polymorphismChallenge;

public class ElectricCar extends Car{

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    private double avgKmPerCharge;
    private int batterySize;

}
