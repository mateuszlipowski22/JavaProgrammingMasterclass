package section11.interface_update;

enum FlightStages implements Trackable{
    GROUND, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this!=GROUND){
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Sattelite implements OrbitEarth{
    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}

interface FlightEnabled{

    double MILES_TO_KM=1.60934;
    double KM_TO_MILES=0.621371;

    void takeOff();
    void land();
    void fly();
}
interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();

}
