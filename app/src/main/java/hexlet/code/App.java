package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;

import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class App {
    private static final Map<String, Game> GAMES = Map.ofEntries(
            entry("2", new Even()),
            entry("3", new Calc()),
            entry("4", new Gcd()),
            entry("5", new Progression()),
            entry("6", new Prime())
    );
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Engine ENGINE = new Engine();
    public static void main(String[] args) {
        displayMenu();
        String playerChoice = getPlayerChoice();
        handlePlayerChoice(playerChoice);
    }

    private static void displayMenu() {
        System.out.println("Please enter the game number and press Enter!");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    private static String getPlayerChoice() {
        System.out.print("Your choice: ");
        return SCANNER.nextLine();
    }

    private static void handlePlayerChoice(String playerChoice) {
        switch (playerChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
                ENGINE.play(GAMES.get(playerChoice));
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
