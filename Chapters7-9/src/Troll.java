public class Troll implements Monster {
    private String name;
    private int hitPoints = 40;

    public void takeDamage(int amount) {
        hitPoints -= amount / 2;
    }

    public String name() {
        return "Troll";
    }

    public int currentHitPoints() {
        return hitPoints;
    }

}