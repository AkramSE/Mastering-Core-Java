import java.util.Random;
import java.util.Scanner;

/**
 * "Guess the Number" Game
 * Features:
 * 1. Constructor generates a random number between 0 and 100.
 * 2. takeUserInput() takes the user's guess.
 * 3. isCorrectNumber() checks if the guess matches the random number
 * and gives "Too High" or "Too Low" hints.
 * 4. Tracks the number of guesses taken.
 */

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor generating a random number
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.print("Guess the number (between 0 and 100): ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("🎉 Yes you guessed it right, it was %d!\n", number);
            System.out.format("You guessed it in %d attempts.\n", noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low... Try again!");
        } else if (inputNumber > number) {
            System.out.println("Too high... Try again!");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("=== Welcome to 'Guess the Number' Game ===");
        Game g = new Game();
        boolean b = false;

        // Loop runs until the user guesses the correct number
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
