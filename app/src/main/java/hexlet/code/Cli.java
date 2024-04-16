package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scan.nextLine();
        System.out.printf("Hello, %s!\n", name);
        return name;
    }
}
