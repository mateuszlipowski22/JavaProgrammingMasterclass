package section11.interface_update;

import java.util.LinkedList;
import java.util.List;

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


        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();

        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}
