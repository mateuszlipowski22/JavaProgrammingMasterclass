package section11.interface_update;

public class Bird extends Animal implements Trackable, FlightEnabled{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()+" is flapping wings");
    }

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
        System.out.println(getClass().getSimpleName()+"'s cordinates are recorded");
    }
}
