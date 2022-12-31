package section7.computerFactory;

public class Main {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theMotherboard, theCase);

//        thePC.getMonitor().drawPixelArt(10, 10, "blue");
//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows XP");

        thePC.powerUp();
    }

}
