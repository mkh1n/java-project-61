package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Rand;

public final class Gcd implements Game {
    public static final String GAME_NAME = "GCD";
    public static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public String getGameName() {
        return GAME_NAME;
    }
    private static int firstNumber;
    private static int secondNumber;
    public String getDescription() {
        return GAME_DESCRIPTION;
    }
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public String getQuestion() {
        firstNumber = Rand.getRandomNumber();
        secondNumber = Rand.getRandomNumber();
        return  Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
    }

    public String getAnswer() {
        return Integer.toString(gcdByEuclidsAlgorithm(firstNumber, secondNumber));
    }
}
