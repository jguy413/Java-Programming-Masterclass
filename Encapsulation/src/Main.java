public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Jon";
//        player.health = 100;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.getHealth());
//
//        damage = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.getHealth());


        EnhancedPlayer player = new EnhancedPlayer("Jon", 190, "Knife");
        System.out.println("Initial Health: " + player.getHealth());
    }

}
