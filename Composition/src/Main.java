public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "ViewSonic", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);

//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

        System.out.println("");
        System.out.println("");


        Dishes dishes = new Dishes(2, 30);
        Details details = new Details("tile", 1, 10, 5, dishes);

        Furniture furniture = new Furniture("wooden", 6);
        Appliances appliances = new Appliances("granite", "gas", "stainless steel", true);

        Kitchen kitchen = new Kitchen(furniture, appliances, details);


        kitchen.kitchenDetails();
        kitchen.getAppliances().cleanAppliances();
        kitchen.getFurniture().prepDinnerTable();

    }

}
