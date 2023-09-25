# Game_Mini_Project

import java.util.Scanner;
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

