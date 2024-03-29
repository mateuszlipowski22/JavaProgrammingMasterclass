package section14.set_and_hashset;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatelite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType()==BodyTypes.MOON){
            return super.addSatelite(moon);
        }else {
            return false;
        }
    }
}
