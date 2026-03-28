import java.util.Random;
import java.util.Scanner;

/**
 * A classic command-line Rock, Paper, Scissors game!
 * Upgraded to a "Best of 3" series using loops and score tracking.
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Score tracking variables
        int userScore = 0;
        int computerScore = 0;

        System.out.println("=== Welcome to Rock, Paper, Scissors! ===");
        System.out.println("--- BEST OF 3 SERIES ---");

        // Loop runs for exactly 3 rounds
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Round " + i + " ---");
            System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");
            int userInput = sc.nextInt();
            
            int computerInput = random.nextInt(3); // Generates 0, 1, or 2

            // Display Computer's Choice
            if (computerInput == 0) {
                System.out.println("Computer chose: Rock (0)");
            } else if (computerInput == 1) {
                System.out.println("Computer chose: Paper (1)");
            } else if (computerInput == 2) {
                System.out.println("Computer chose: Scissors (2)");
            }

            // Determine the round winner and update scores
            if (userInput == computerInput) {
                System.out.println("Round Result: It's a Draw! No points awarded.");
            } else if ((userInput == 0 && computerInput == 2) || 
                       (userInput == 1 && computerInput == 0) || 
                       (userInput == 2 && computerInput == 1)) {
                System.out.println("Round Result: You Win this round! 🎉");
                userScore++; // Increase user score by 1
            } else {
                System.out.println("Round Result: Computer Wins this round! 🤖");
                computerScore++; // Increase computer score by 1
            }
        }

        // Final Result Decision after 3 rounds
        System.out.println("\n=================================");
        System.out.println("FINAL SCORE -> You: " + userScore + " | Computer: " + computerScore);
        
        if (userScore > computerScore) {
            System.out.println("🏆 CHAMPION! You won the series! 🏆");
        } else if (computerScore > userScore) {
            System.out.println("💀 GAME OVER! Computer won the series! 💀");
        } else {
            System.out.println("🤝 MATCH TIED! It's an overall Draw! 🤝");
        }
        System.out.println("=================================");
    }
          }
