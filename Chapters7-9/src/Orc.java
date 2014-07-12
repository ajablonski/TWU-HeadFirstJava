public class Orc implements Monster {
    private String name;
    private int hitPoints = 20;

    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    public String name() {
        return "Orc";
    }

    public int currentHitPoints() {
        return hitPoints;
    }

}