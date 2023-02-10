package section11.abstractionUpdate;

import java.util.Objects;

public class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " swimming");
        }else {
            System.out.println(type + " fast swimming");
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
