package section11.abstraction_update;

import java.util.Objects;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " swimming");
        }else {
            System.out.println(getExplicitType() + " fast swimming");
        }
    }

    @Override
    public void makeNoise() {
        if(Objects.equals(type, "Goldfish")){
            System.out.println("splash");
        }else {
            System.out.println("splish");
        }
    }
}
