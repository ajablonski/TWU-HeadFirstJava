import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Orc());
        monsters.add(new Troll());

        for (Monster m : monsters) {
            m.takeDamage(10);
        }

        for (Monster m : monsters) {
            System.out.println("Name: " + m.name() + " | Hit points: " + m.currentHitPoints());
        }
    }
}
