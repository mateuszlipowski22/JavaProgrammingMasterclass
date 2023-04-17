package section33.encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health>0 && health<=100){
            this.hitPoints =health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -=damage;
        if(this.hitPoints <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
