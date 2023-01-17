package section11.abstraction;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at it");
    }
}
