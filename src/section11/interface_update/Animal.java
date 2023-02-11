package section11.interface_update;

enum FlightStages implements Trackable{
    GROUND, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this!=GROUND){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length];
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

    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on "+getClass().getSimpleName());
//        return null;
        FlightStages nextStage=stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}
interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();

}
