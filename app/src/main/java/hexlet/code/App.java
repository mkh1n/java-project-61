package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter!");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scan = new Scanner(System.in);
        Integer gameNumber = scan.nextInt();

        System.out.printf("Your choice: %d\n\n", gameNumber);

        switch (gameNumber){
            case (0):
                break;
            case (1):
                Cli.greeting();
                break;
            case (2):
                Engine.play(Even.main());
                break;
            case (3):
                Engine.play(Calc.main());
            case (4):
                Engine.play(Gcd.main());
            case (5):
                Engine.play(Progression.main());
            case (6):
                Engine.play(Prime.main());
        }
    }
}
