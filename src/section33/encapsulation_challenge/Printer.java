package section33.encapsulation_challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }else {
            this.tonerLevel=-1;
        }
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel>0 && tonerLevel<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }else {
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint=pages/2+pages%2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
