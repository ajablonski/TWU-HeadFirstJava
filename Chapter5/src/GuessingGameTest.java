/**
 * Created by alex on 7/9/14.
 */
public class GuessingGameTest {
    public static void testResult(boolean result) {
        if (result) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        GuessingGame g = new GuessingGame();
        int t = g.getTarget();
        String resp;
        resp = g.guess(t - 1);
        testResult(resp.equals("higher"));
        resp = g.guess(t + 1);
        testResult(resp.equals("lower"));
        resp = g.guess(t);
        testResult(resp.equals("correct"));
    }
}
