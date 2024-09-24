package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

import hexlet.code.Rand;
import hexlet.code.Rand.*;
public class Calc implements Game {
    public static final String GAME_NAME = "Calc";
    public static final String GAME_DESCRIPTION = "What is the result of the expression?";
    public static final String[] OPERATIONS = {"+", "-", "*"};
    public static int firstOperand;
    public static int secondOperand;
    public static String currentOperation;

    public String getGameName() {
        return GAME_NAME;
    }

    public String getDescription() {
        return GAME_DESCRIPTION;
    }

    public String getQuestion() {
        int randomIndex = new Random().nextInt(OPERATIONS.length);
        currentOperation = OPERATIONS[randomIndex];
        firstOperand = Rand.getRandomNumber();
        secondOperand = Rand.getRandomNumber();
        return Integer.toString(firstOperand) + ' ' + currentOperation + ' ' + Integer.toString(secondOperand);
    }

    public String getAnswer() {
        switch (currentOperation) {
            case ("*"):
                return Integer.toString(firstOperand * secondOperand);
            case ("+"):
                return Integer.toString(firstOperand + secondOperand);
            default:
                return Integer.toString(firstOperand - secondOperand);
        }
    }
}

