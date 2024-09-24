package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int ROUND_MAX = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    private String name;
    private int score;
    private String rules;

    public void play(Game game) {
        initializeGame(game);
        for (int i = 0; i < ROUND_MAX; i++) {
            if (!playRound(game)) {
                break;
            }
        }
        if (score == ROUND_MAX) {
            System.out.printf("Congratulations, %s!\n", name);
        }
    }

    private void initializeGame(Game game) {
        name = Cli.greeting();
        score = 0;
        rules = game.getDescription();
        System.out.println(rules);
    }

    private boolean playRound(Game game) {
        String question = game.getQuestion();
        System.out.printf("Question: %s\n", question);
        System.out.print("Your answer: ");
        String answer = SCANNER.nextLine();
        System.out.println(answer);
        String rightAnswer = game.getAnswer();

        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
            score++;
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, rightAnswer);
            System.out.printf("Let's try again, %s!\n", name);
            return false;
        }
    }
}
