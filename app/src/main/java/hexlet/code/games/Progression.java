package hexlet.code.games;

import hexlet.code.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Progression implements Game {
    public static final String GAME_NAME = "Progression";
    public static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public String getGameName() {
        return GAME_NAME;
    }

    private int hiddenIndex;
    private List<String> progression;
    private int start;
    private int step;

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
        int minLen = 5;
        int length = new Random().nextInt(minLen) + minLen;
        int minStep = 2;
        step = new Random().nextInt(minLen) + minStep;
        int minStart = 20;
        start = new Random().nextInt(minStart) + minStep;
        hiddenIndex = new Random().nextInt(length);

        progression = new ArrayList<>();
        for (int j = 0; j < length; j += 1) {
            progression.add(Integer.toString(start + step * j));
        }
        progression.set(hiddenIndex, "..");
        return String.join(" ", progression);
    }

    public String getAnswer() {
        return Integer.toString(start + step * hiddenIndex);
    }
}
