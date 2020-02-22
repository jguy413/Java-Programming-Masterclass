public class Main {

    public static void main(String[] args) {

        Lambo lambo = new Lambo("car", 2, 4, "gallardo", 2020, "fuschia", 240, true, "parked", 0);

        System.out.println(lambo.getTopSpeed());
        lambo.setTopSpeed(220);

        lambo.setModel("huracan");

        System.out.println(lambo.getTopSpeed());
        System.out.println(lambo.getModel());

    }



}
