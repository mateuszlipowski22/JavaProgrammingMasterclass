package section8.encapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer() {
        this(100,0,false);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempTonerLevel = tonerLevel+tonerAmount;
        if(tempTonerLevel >100 || tempTonerLevel<0){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pagesToPrint){
        int jobPages=((duplex)?(pagesToPrint/2+pagesToPrint%2):pagesToPrint);
        pagesPrinted += jobPages;
        if(duplex){
            System.out.println("Duplex printer");
        }
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
