package section11.interface_update;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s cordinates are recorded");
    }

}
