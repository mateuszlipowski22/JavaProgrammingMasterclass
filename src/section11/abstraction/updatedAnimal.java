package section11.abstraction;

public abstract class updatedAnimal {

    protected String type;
    private String size;
    private double weight;

    public updatedAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    public abstract void move();
    public abstract void makeNoise();

}
