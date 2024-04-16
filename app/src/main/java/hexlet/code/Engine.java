package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void play(String[][] gameTools) {
        String name = Cli.greeting();
        int score = 0;
        String rules = gameTools[0][0];
        String[] questions = gameTools[1];
        String[] rightAnswers = gameTools[2];

        System.out.println(rules);

        Scanner scan = new Scanner(System.in);
        final int roundMax = 3;
        for (int i = 0; i < roundMax; i += 1) {
            var question = questions[i];

            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");

            var answer = scan.nextLine();


            var rightAnswer = rightAnswers[i];

            if (answer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
                score += 1;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, rightAnswer);
                System.out.printf("Let's try again, %s!\n", name);
                break;
            }
            if (score == roundMax) {
                System.out.printf("Congratulations, %s!\n", name);
            }
        }
    }
}
