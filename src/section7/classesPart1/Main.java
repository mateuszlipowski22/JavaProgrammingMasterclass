package section7.classesPart1;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porshe");
        car.setModel("Carrera");
        car.setColor("Black");
        car.setConvertible(true);
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porshe");
        targa.setModel("Targa");
        targa.setColor("Black");
        targa.setConvertible(false);
        targa.describeCar();


        System.out.println(car.getMake());

    }

}
