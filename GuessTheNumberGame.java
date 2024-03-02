import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        
        int times = 0;
        Scanner input = new Scanner(System.in);
        
        GuessGame game = new GuessGame();
        game.displayGameBar(); // displays game logo

        System.out.print("Enter how attempts do you want? >>> ");
        int attempts = input.nextInt();
        game.setNoOfGuesses(attempts);

        boolean found = false;
        int score = 100;

        for (int i = 0; i < game.getNoOfGuesses(); i++) {
            game.getUserInput();
            found = game.isCorrectNumber();

            if (found) {
                score -= (times * 10);
                break;
            }
            
            times++;
            System.out.println(game.getNoOfGuesses() - times + " attempts left!");
        }

        if (score == 0) {
            score = 10;
        }

        if (found) {
            System.out.println("Hurrah! Correct Guess! You won:) & Your score is " + score);
        } else {
            System.out.println("Better Luck Next time!");
        }
    }
}

// class for game
class GuessGame {

    int randomNumber;
    int userGuess;
    int noOfGuesses;
    Random rand = new Random();

    GuessGame() {
        randomNumber = rand.nextInt(10) + 1;
    }

    void displayGameBar() {
        System.out.println("\n------------ Guess the Number Game ----------------\n");
    }

    void getUserInput() {
        System.out.print("Enter your guess(1-10): ");
        userGuess = new Scanner(System.in).nextInt();
    }

    boolean isCorrectNumber() {
        return userGuess == randomNumber;
    }

    void setNoOfGuesses(int n) { // setter
        this.noOfGuesses = n;
    }

    int getNoOfGuesses() { // getter
        return noOfGuesses;
    }
}
