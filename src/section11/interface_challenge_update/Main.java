package section11.interface_challenge_update;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UserType.GOVERNMENT));
        mappables.add(new Building("City Opera House", UserType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UserType.SPORTS));

        mappables.add(new UtilityLine("Collage St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvdt", UtilityType.WATER));

        for (var m : mappables){
            Mappable.mapIt(m);
        }
    }

}
