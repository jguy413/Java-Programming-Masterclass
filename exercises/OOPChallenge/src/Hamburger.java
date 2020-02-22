public class Hamburger {

    public String name;
    private String breadType;
    public int meat;
    public String addition1;
    public String addition2;
    public String addition3;
    private String addition4;
    private double price;
    private double basePrice = 8.00;

    public Hamburger(String breadType, int meat) {
        this(breadType, meat, "", "", "", "", 8.00);
    }


    public Hamburger(String breadType, int meat, String addition1, String addition2, String addition3, String addition4, double basePrice) {
        this.name = "Basic";
        this.breadType = breadType;
        if (meat < 0 || meat > 3) {
            this.meat = 1;
        } else {
            this.meat = meat;
        }

        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;

        this.price = basePrice;
        this.basePrice = basePrice;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }
    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }
    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }
    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }
    public void setMeat(int meat) {
        if(meat >= 0 && meat <= 3) {
            this.meat = meat;
        }
        else {
            System.out.println("Invalid number of patties");
        }
    }
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }


    public String getBreadType() {
        return breadType;
    }

    public int getMeat() {
        return meat;
    }

    public String getAddition1() {
        if(this.addition1 == "") {
            return "No Addition";
        }
        else {
            return addition1;
        }
    }

    public String getAddition2() {
        if(this.addition2 == "") {
            return "No Addition";
        }
        else {
            return addition2;
        }
    }

    public String getAddition3() {
        if(this.addition3 == "") {
            return "No Addition";
        }
        else {
            return addition3;
        }
    }

    public String getAddition4() {
        if(this.addition4 == "") {
            return "No Addition";
        }
        else {
            return addition4;
        }
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void getAllInfo() {

        System.out.println("Base Price: " + this.basePrice);
        if(this.meat > 1) {
            System.out.println("Additional Patties (Price): " + (this.meat-1) + " (" + extraCost(this.meat) + ")");
        }
        System.out.println("Additional 1 (Price): " + getAddition1() + " (" + extraCost(getAddition1()) + ")");
        System.out.println("Additional 2 (Price): " + getAddition2() + " (" + extraCost(getAddition2()) + ")");
        System.out.println("Additional 3 (Price): " + getAddition3() + " (" + extraCost(getAddition3()) + ")");
        System.out.println("Additional 4 (Price): " + getAddition4() + " (" + extraCost(getAddition4()) + ")");
        System.out.println("Total Price: " + getPrice());

    }



    public double getPrice() {
            return this.price + extraCost(this.meat) + extraCost(getAddition1()) + extraCost(getAddition2()) + extraCost(getAddition3()) + extraCost(getAddition4());
    }

    public double extraCost(String addition) {
        double extraCost = 0.0;
        if(addition == "" || addition == "No Addition") {
            extraCost += 0.0;
        }
        else if (addition == "lettuce") {
            extraCost += .25;
        }
        else if (addition == "tomato") {
            extraCost += .25;
        }
        else if (addition == "onion") {
            extraCost += .25;
        }
        else if (addition == "pickle") {
            extraCost += .25;
        }
        else if (addition == "ketchup") {
            extraCost += .25;
        }
        else if (addition == "mustard") {
            extraCost += .25;
        }
        else if (addition == "mayo") {
            extraCost += .25;
        }
        else if (addition == "carmelized onions") {
            extraCost += .5;
        }
        else if (addition == "bbq sauce") {
            extraCost += .5;
        }
        else if (addition == "jalepenos") {
            extraCost += .5;
        }
        else if (addition == "cheese") {
            extraCost += .5;
        }
        else if (addition == "bacon") {
            extraCost += 1.0;
        }
        else if (addition == "fried egg") {
            extraCost += 1.0;
        }
        else if (addition == "pepperjack") {
            extraCost += 1.0;
        }
        else if (addition == "drink") {
            extraCost += 1.0;
        }
        else if (addition == "chips") {
            extraCost += .5;
        }
        else {
            extraCost += 2.0;
        }
        return extraCost;

    }


    public double extraCost(int meat) {
        double extraCost = 0.0;
        if(meat > 1) {
            extraCost += (meat-1) * 1.75;
        }
        return extraCost;
    }

}
