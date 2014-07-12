public class MonsterTest {
    public static void testResult(String testName, boolean result) {
        if (result) {
            System.out.println(testName + ". Passed");
        } else {
            System.out.println(testName + ". Failed");
        }
    }

    public static void main(String[] args) {

        Orc o = new Orc();
        testResult("O1", o.name().equals("Orc"));
        testResult("O2", o.currentHitPoints() == 20);
        o.takeDamage(10);
        testResult("O3", o.currentHitPoints() == 10);

        Troll t = new Troll();
        testResult("T1", t.name().equals("Troll"));
        testResult("T2", t.currentHitPoints() == 40);
        t.takeDamage(10);
        testResult("T3", t.currentHitPoints() == 35);
    }
}