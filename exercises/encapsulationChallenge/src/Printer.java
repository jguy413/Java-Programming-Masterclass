public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted;
    public boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >=0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void addToner(int addToner) {
        if(this.tonerLevel + addToner > 100) {
            this.tonerLevel = 100;
        }
        else {
            this.tonerLevel = this.tonerLevel + addToner;
        }
    }

    public void printPage() {
        if(this.duplex) {
            if(tonerLevel - 20 >= 0) {
                this.pagesPrinted += 2;
                this.tonerLevel -= 20;
            }
            else {
                System.out.println("Add Toner to Print");
            }
        }
        else {
            if(tonerLevel - 10 >= 0) {
                this.pagesPrinted += 1;
                this.tonerLevel -= 10;
            }
            else {
                System.out.println("Add Toner to Print");
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
