package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Rand;

public final class Even implements Game {
    public static final String GAME_NAME = "Even";
    public static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public String getGameName() {
        return GAME_NAME;
    }
    private int number;
    public String getDescription() {
        return GAME_DESCRIPTION;
    }
    public String getQuestion() {
        this.number = Rand.getRandomNumber();
        return Integer.toString(this.number);
    }

    public String getAnswer() {
        return this.number % 2 == 0 ? "yes" : "no";
    }
}
