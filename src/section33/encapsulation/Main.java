package section33.encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name="Tim";
//        player.health=20;
//        player.weapon="Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining healtth "+player.healthRemaining() );
//
//        damage=11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("Remaining healtth "+player.healthRemaining() );

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");

        System.out.println("Initial health is "+player.getHitPoints());

    }

}
