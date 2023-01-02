package section8.encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private int healthPercantage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        this.healthPercantage = (health<=0 ? 1 : (health>100 ? 100:health));
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercantage = healthPercantage - damage;

        if(healthPercantage <0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return healthPercantage;
    }

    public void restoreHealth(int extraHealth){
        healthPercantage +=extraHealth;

        if(healthPercantage >100){
            System.out.println("Player restored to 100%");
            healthPercantage =100;
        }
    }

}
