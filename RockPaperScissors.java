import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors):");

        String playerChoice = scanner.nextLine();

        if (!isValidChoice(playerChoice)) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        String result = determineWinner(playerChoice, computerChoice);
        System.out.println(result);

        scanner.close();
    }

    static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }

    static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        } else if (playerChoice.equalsIgnoreCase("Rock")) {
            return (computerChoice.equalsIgnoreCase("Scissors")) ? "You win!" : "You lose!";
        } else if (playerChoice.equalsIgnoreCase("Paper")) {
            return (computerChoice.equalsIgnoreCase("Rock")) ? "You win!" : "You lose!";
        } else {
            return (computerChoice.equalsIgnoreCase("Paper")) ? "You win!" : "You lose!";
        }
    }
}
