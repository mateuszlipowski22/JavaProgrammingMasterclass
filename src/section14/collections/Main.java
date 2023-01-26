package section14.collections;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olimpian", 8, 12);
        theatre.getSeats();

        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry the seat is taken");
        }

    }

}
