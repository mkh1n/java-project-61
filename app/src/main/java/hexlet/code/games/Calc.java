package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String[][] main(){
        String[] operations = {"+", "-", "*"};
        String[] rules = new String[]{"What is the result of the expression?"};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            int randomIndex = new Random().nextInt(operations.length);

            String operation = operations[randomIndex];
            int firstOperand = (int) Math.floor(Math.random() * 100);
            int secondOperand = (int) Math.floor(Math.random() * 100);
            questions[i] = Integer.toString(firstOperand) + ' ' + operation + ' ' + Integer.toString(secondOperand);
            switch (operation){
                case ("*"):
                    rightAnswers[i] = Integer.toString(firstOperand * secondOperand);
                    break;
                case ("+"):
                    rightAnswers[i] = Integer.toString(firstOperand + secondOperand);
                    break;
                case ("-"):
                    rightAnswers[i] = Integer.toString(firstOperand - secondOperand);
                    break;
            }

        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
