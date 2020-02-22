public class Kitchen {

    private Furniture furniture;
    private Appliances appliances;
    private Details details;

    public Kitchen(Furniture furniture, Appliances appliances, Details details) {
        this.furniture = furniture;
        this.appliances = appliances;
        this.details = details;
    }

    public void kitchenDetails () {
        details.dishesToCabinet();
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Appliances getAppliances() {
        return appliances;
    }

    private Details getDetails() {
        return details;
    }
}
