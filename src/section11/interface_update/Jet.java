package section11.interface_update;

public class Jet implements Trackable, FlightEnabled{

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s cordinates are recorded");
    }

    @Override
    public FlightStages transition(FlightStages stages) {
        System.out.println(getClass().getSimpleName()+" transitioning");
        return FlightEnabled.super.transition(stages);
    }
}
