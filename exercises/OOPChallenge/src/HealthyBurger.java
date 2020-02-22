public class HealthyBurger extends Hamburger {

    private String addition5;
    private String addition6;
    private double basePrice = 7.50;


    public HealthyBurger() {
        this("", "", "" ,"" , "", "");
    }

    public HealthyBurger(String addition1, String addition2, String addition3, String addition4, String addition5, String addition6) {
        super("brown rye", 1, addition1, addition2, addition3, addition4, 7.50);
        super.name = "Veggie";
        this.addition5 = addition5;
        this.addition6 = addition6;
    }


    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public void setAddition6(String addition6) {
        this.addition6 = addition6;
    }

    @Override
    public void setMeat(int meat) {
        System.out.println("Standard Option Only for Veggie Burger");
    }

    @Override
    public void setBreadType(String breadType) {
        System.out.println("Brown Rye Only Option for Veggie Burger");
    }

    public String getAddition5() {
        return addition5;
    }

    public String getAddition6() {
        return addition6;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        return price + extraCost(getAddition5()) + extraCost(getAddition6());
    }

    @Override
    public void getAllInfo() {
        System.out.println("Base Price: " + this.basePrice);
        System.out.println("Additional 1 (Price): " + getAddition1() + " (" + extraCost(getAddition1()) + ")");
        System.out.println("Additional 2 (Price): " + getAddition2() + " (" + extraCost(getAddition2()) + ")");
        System.out.println("Additional 3 (Price): " + getAddition3() + " (" + extraCost(getAddition3()) + ")");
        System.out.println("Additional 4 (Price): " + getAddition4() + " (" + extraCost(getAddition4()) + ")");
        System.out.println("Additional 5 (Price): " + getAddition5() + " (" + extraCost(getAddition5()) + ")");
        System.out.println("Additional 6 (Price): " + getAddition6() + " (" + extraCost(getAddition6()) + ")");
        System.out.println("Total Price: " + getPrice());
    }
}
