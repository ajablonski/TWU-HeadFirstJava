import java.util.ArrayList;
/**
 * Created by alex on 7/10/14.
 */
public class GuessList {
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public void addGuess(int guess) {
        guesses.add(guess);
    }

    public String getGuessString() {
        StringBuilder sb = new StringBuilder();
        for (Integer i : guesses) {
            sb.append(i + " ");
        }
        return sb.toString();
    }
}
