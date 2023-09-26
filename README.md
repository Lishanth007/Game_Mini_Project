<b># Game_Mini_Project<b\>

<b>import java.util.Scanner;<b\>
import java.util.Random;
These are import statements, which bring in predefined classes that are part of the Java Standard Library. Scanner is a class that allows you to take input from the user, and Random is a class that allows you to generate random numbers.

        if (!isValidChoice(playerChoice)) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }
This block checks if the player's choice is valid by calling the isValidChoice method. If the choice is not valid, it prints an error message, closes the scanner, and exits the program.

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];
These lines generate a random number between 0 and 2 (inclusive) using random.nextInt(3), and then use that number to select a choice from the options array. This simulates the computer's choice in the game.

        System.out.println("Computer chose: " + computerChoice);
This line prints out the computer's choice.

        String result = determineWinner(playerChoice, computerChoice);
This line calls the determineWinner method, passing in the player's choice and the computer's choice as arguments. It assigns the result to the variable result.

        System.out.println(result);
        scanner.close();
This line prints out the result of the game (e.g., "You win!", "You lose!", or "It's a tie!")
Finally, this line closes the Scanner to free up system resources.
    
    static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }

This defines a static method named isValidChoice that takes a String parameter choice. It checks if the choice is "Rock", "Paper", or "Scissors" (ignoring case) and returns true if it is, and false otherwise.

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
This defines a static method named determineWinner that takes two String parameters: playerChoice and computerChoice. It compares these choices to determine the winner of the game and returns a message indicating the result (e.g., "You win!", "You lose!", or "It's a tie!").
