package section7.classesPart1;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;


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
