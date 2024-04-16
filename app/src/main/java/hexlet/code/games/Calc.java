package hexlet.code.games;

import java.util.Random;

public class Calc {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        final int gameToolsLen = 3;
        String[] operations = {"+", "-", "*"};
        String[] rules = new String[]{"What is the result of the expression?"};
        String[] questions = new String[gameToolsLen];
        String[] rightAnswers = new String[gameToolsLen];
        for (int i = 0; i < gameToolsLen; i += 1) {
            int randomIndex = new Random().nextInt(operations.length);

            String operation = operations[randomIndex];

            final int hundred = 100;
            int firstOperand = (int) Math.floor(Math.random() * hundred);
            int secondOperand = (int) Math.floor(Math.random() * hundred);
            questions[i] = Integer.toString(firstOperand) + ' ' + operation + ' ' + Integer.toString(secondOperand);
            switch (operation) {
                case ("*"):
                    rightAnswers[i] = Integer.toString(firstOperand * secondOperand);
                    break;
                case ("+"):
                    rightAnswers[i] = Integer.toString(firstOperand + secondOperand);
                    break;
                default:
                    rightAnswers[i] = Integer.toString(firstOperand - secondOperand);
                    break;
            }

        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
