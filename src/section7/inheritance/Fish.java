package section7.inheritance;

public class Fish extends Animal{

    private int grills;
    private int fins;

    public Fish(String type, double weight, int grills, int fins) {
        super(type, "small", weight);
        this.grills = grills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscles moving");
    }

    private void moveBackFin(){
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "grills=" + grills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
