package section11.interface_update;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal =bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.fly();
        bird.land();
        bird.move();
        bird.track();
        bird.move();

        flier.fly();

        inFlight(bird);
        inFlight(flier);

        inFlight(new Jet());

        Truck truck = new Truck();
        truck.track();

        double kmTravelled=100;
        double milesTravelled=kmTravelled*FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck travelled %.2f km or %.2f miles%n", kmTravelled,milesTravelled);

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}
