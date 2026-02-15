import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    private int randomNumber;
    private int attempts;

    public GuessingGame(int range) {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(range) + 1;
        this.attempts = 0;
    }

    public String checkGuess(int guess) {
        attempts++;
        if (guess < randomNumber) {
            return "Too low!";
        } else if (guess > randomNumber) {
            return "Too high!";
        } else {
            return "Correct";
        }
    }

    public int getAttempts() {
        return attempts;
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame(100);

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();
            String result = game.checkGuess(userGuess);

            if (result.equals("Correct")) {
                System.out.println("Well done! Total attempts: " + game.getAttempts());
                break;
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }
}