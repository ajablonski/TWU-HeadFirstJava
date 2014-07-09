import java.io.*;

/**
 * Created by alex on 7/9/14.
 */
public class GuessingGame {
    private int target;

    public GuessingGame() {
        target = (int) (Math.random() * 100) + 1;
    }

    public int getTarget() {
        return target;
    }

    public String guess(int guess) {
        int t = getTarget();
        String response;
        if (guess > t) {
            response = "lower";
        } else if (guess < t) {
            response = "higher";
        } else {
            response = "correct";
        }
        return response;
    }

    public int getUserGuess() {
        int userGuess;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String inputLine = is.readLine();
            userGuess = Integer.parseInt(inputLine);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            userGuess = -1;
        }

        return userGuess;
    }

    public void play() {
        int guess;
        String status;
        do {
            System.out.print("Guess a number: ");
            guess = getUserGuess();
            status = guess(guess);
            if (status.equals("correct")) {
                System.out.println("Correct - the number was " + guess);
            } else {
                System.out.println("Guess " + status);
            }
        } while (!status.equals("correct"));
    }
}
