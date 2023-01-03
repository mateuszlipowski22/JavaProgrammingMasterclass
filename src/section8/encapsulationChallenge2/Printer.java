package section8.encapsulationChallenge2;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100,0,false);
    }

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel,0,duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<=100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int printPages(int pagesToPrint){
        int jobPages=((duplex)?(pagesToPrint/2+pagesToPrint%2):pagesToPrint);
        pagesPrinted += jobPages;
        if(duplex){
            System.out.println("Printing in duplex mode");
        }
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
