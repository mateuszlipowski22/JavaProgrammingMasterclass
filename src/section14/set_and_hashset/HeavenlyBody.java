package section14.set_and_hashset;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> sattellites;
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.sattellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatelite(HeavenlyBody moon){
        return this.sattellites.add(moon);
    }

    public Set<HeavenlyBody> getSattellites() {
        return new HashSet<>(this.sattellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashCode is called");
        return this.name.hashCode()+57+this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.bodyType + ", " + this.orbitalPeriod;
    }
}
