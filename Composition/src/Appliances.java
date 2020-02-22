public class Appliances {

    private String counterTop;
    private String ovenPower;
    private String fridge;
    private boolean coffeeMaker;

    public Appliances(String counterTop, String ovenPower, String fridge, boolean coffeeMaker) {
        this.counterTop = counterTop;
        this.ovenPower = ovenPower;
        this.fridge = fridge;
        this.coffeeMaker = coffeeMaker;
    }

    public void cleanAppliances() {
        if(!this.coffeeMaker) {
            System.out.println("Cleaning " + getCounterTop() + " countertops...finished!");
            System.out.println("Cleaning " + getOvenPower() + " oven...finished!");
            System.out.println("Cleaning " + getFridge() + " fridge...too tired....need.....coffee......");
        }
        else {
            System.out.println("Cleaning " + getCounterTop() + " countertops...finished!");
            System.out.println("Cleaning " + getOvenPower() + " oven...finished!");
            System.out.println("Cleaning " + getFridge() + " fridge...finished!");
            System.out.println("The appliances are cleaned");
        }
    }

    public String getCounterTop() {
        return this.counterTop;
    }

    public String getOvenPower() {
        return this.ovenPower;
    }

    public String getFridge() {
        return this.fridge;
    }

    public boolean isCoffeeMaker() {
        return this.coffeeMaker;
    }
}
