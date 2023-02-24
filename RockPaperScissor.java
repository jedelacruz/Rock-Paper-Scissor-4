package rockpaperscissor;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    String[] options = {"rock", "paper", "scissors"};

    while (true) {
      // Get the user's choice
      System.out.println("Enter your choice (rock, paper, scissors):");
      String userChoice = scanner.nextLine();

      // Make sure the user entered a valid choice
      if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
        System.out.println("Invalid choice. Please try again.");
        continue;
      }

      // Generate a random choice for the computer
      String computerChoice = options[rand.nextInt(options.length)];

      System.out.println("You chose " + userChoice + " and the computer chose " + computerChoice + ".");

      // Determine the winner
      if (userChoice.equalsIgnoreCase(computerChoice)) {
        System.out.println("It's a tie!");
      } else if ( (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || 
                  (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) || 
                  (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ) {
        System.out.println("You win!");
      } else {
        System.out.println("The computer wins!");
      }

      // See if the user wants to play again
      System.out.println("Do you want to play again? (y/n)");
      String playAgain = scanner.nextLine();
      if (!playAgain.equalsIgnoreCase("y")) {
        break;
      }
    }

    scanner.close();
  }
}
