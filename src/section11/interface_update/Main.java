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

    }

}
