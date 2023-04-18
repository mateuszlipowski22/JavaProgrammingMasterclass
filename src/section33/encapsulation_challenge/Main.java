package section33.encapsulation_challenge;


public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int printedPages = printer.printPages(4);
        System.out.println("Pages printed was "+ printedPages + " new total print count for printers " + printer.getPagesPrinted());
        printedPages = printer.printPages(2);
        System.out.println("Pages printed was "+ printedPages + " new total print count for printers " + printer.getPagesPrinted());

    }

}
