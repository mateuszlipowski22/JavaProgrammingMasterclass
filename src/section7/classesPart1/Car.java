package section7.classesPart1;

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make==null) make="unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "porshe", "tesla" -> this.make=make;
            default -> this.make="Unsupported";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println("Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", convertible=" + convertible +
                '}');
    }

}
