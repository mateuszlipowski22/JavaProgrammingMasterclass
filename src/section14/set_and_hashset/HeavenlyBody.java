package section14.set_and_hashset;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> sattellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.sattellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.sattellites.add(moon);
    }

    public Set<HeavenlyBody> getSattellites() {
        return new HashSet<>(this.sattellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        System.out.println("obj.getClass() is "+ obj.getClass());
        System.out.println("this.getClass() is "+ this.getClass());
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode is called");
        return this.name.hashCode()+57;
    }
}
