public class Main {

    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("White", 2);
//
//        System.out.println(hamburger.getPrice());
//        System.out.println(hamburger.getBasePrice());
//
//        hamburger.setAddition1("lettuce");
//        System.out.println(hamburger.getPrice());
//
//        hamburger.setAddition1("cheese");
//        System.out.println(hamburger.getPrice());
//
//        hamburger.getAllInfo();
//        hamburger.setMeat(1);
//        hamburger.setAddition2("bacon");
//        hamburger.getAllInfo();
//
//        System.out.println("");
//        System.out.println("");

        HealthyBurger veggie = new HealthyBurger();

        System.out.println(veggie.getPrice());

        veggie.setAddition1("lettuce");
        veggie.setAddition2("tomato");
        veggie.setAddition3("pepperjack");
        veggie.setAddition4("olives");
        veggie.getAllInfo();

        System.out.println("");
        System.out.println("");

        HealthyBurger veggie2 = new HealthyBurger("white", "cheese", "", "", "", "");
        System.out.println(veggie2.getName());
        System.out.println(veggie2.getBreadType());
        System.out.println(veggie2.getMeat());
        System.out.println(veggie2.getAddition2());
        System.out.println(veggie2.getAddition4());

        System.out.println("");
        System.out.println("");

        Deluxe deluxe = new Deluxe("Wheat", 1);
        deluxe.getAllInfo();
        deluxe.setMeat(3);
        deluxe.getAllInfo();
        deluxe.setAddition1("bacon");
        System.out.println(deluxe.getBasePrice());

    }

}
