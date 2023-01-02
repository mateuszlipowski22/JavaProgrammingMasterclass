package section8.encapsulationChallenge;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 0, false);

        System.out.println("initial page count = "+ printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current jpb pages = %d, Printed total = %d %n",pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.printf("Current jpb pages = %d, Printed total = %d %n",pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.printf("Current jpb pages = %d, Printed total = %d %n",pagesPrinted, printer.getPagesPrinted());
    }

}
