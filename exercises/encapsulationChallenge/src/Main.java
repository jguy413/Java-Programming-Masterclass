public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100,true);

        printer.printPage();
        printer.printPage();
        System.out.println("Printer Toner Level: " + printer.getTonerLevel());
        System.out.println("Printer Pages Printed: " + printer.getPagesPrinted());

        printer.addToner(30);
        System.out.println("Printer Toner Level: " + printer.getTonerLevel());

        //Printer printer2 = new Printer(30,false);
        printer.duplex = false;
        printer.printPage();
        printer.printPage();
        printer.printPage();
        printer.printPage();
        System.out.println("Printer2 Toner Level: " + printer.getTonerLevel());
        System.out.println("Printer2 Pages Printed: " + printer.getPagesPrinted());
        printer.addToner(50);
        System.out.println("Printer2 Toner Level: " + printer.getTonerLevel());

    }
}
