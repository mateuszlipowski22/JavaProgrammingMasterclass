package section8.polymorphismChallenge;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrarri = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6) ;
        runRace(ferrarri);

        Car tesla = new ElectricCar("2022 Red Tesla Model3", 568, 75);
        runRace(tesla);

        Car ferrarriHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8,8) ;
        runRace(ferrarriHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

}
