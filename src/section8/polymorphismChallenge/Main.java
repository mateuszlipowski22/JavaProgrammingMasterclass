package section8.polymorphismChallenge;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrarri = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6) ;
        runRace(ferrarri);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

}
