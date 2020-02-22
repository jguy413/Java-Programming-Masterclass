public class Deluxe extends Hamburger {

    private double basePrice = 8.00;
    private String breadType;


    public Deluxe (String breadType, int meat) {
        super(breadType, meat, "chips", "drink", "", "", 8.00);
        super.name = "Deluxe";
    }

    @Override
    public void setAddition1(String addition1) {
        System.out.println("No Addition Changes Allowed");
    }

    @Override
    public void setAddition2(String addition2) {
        setAddition1(addition2);
    }

    @Override
    public void setAddition3(String addition3) {
        setAddition1(addition3);
    }

    @Override
    public void setAddition4(String addition4) {
        setAddition1(addition4);
    }
}
