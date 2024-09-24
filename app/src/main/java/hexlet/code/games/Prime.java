package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Rand;

public final class Prime implements Game {
    public static final String GAME_NAME = "Prime";
    public static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public String getGameName() {
        return GAME_NAME;
    }
    private static int number;

    public static boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public String getDescription() {
        return GAME_DESCRIPTION;
    }

    public String getQuestion() {
        number = Rand.getRandomNumber();
        return Integer.toString(number);
    }

    public String getAnswer() {
        return isPrime(number) ? "yes" : "no";
    }
}

