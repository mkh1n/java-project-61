package hexlet.code.games;

import java.util.Random;

public class Progression {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        int gameToolsLen = 3;
        String[] rules = new String[]{"What number is missing in the progression?"};
        String[] questions = new String[gameToolsLen];
        String[] rightAnswers = new String[gameToolsLen];
        for (int i = 0; i < gameToolsLen; i += 1) {
            int minLen = 5;
            int minStep = 2;
            int minStart = 20;
            int length = new Random().nextInt(minLen) + minLen;
            String[] progression = new String[length];
            int step = new Random().nextInt(minLen) + minStep;
            int start = new Random().nextInt(minStart) + minStep;
            int hideIndex = new Random().nextInt(length);

            for (int j = 0; j < length; j += 1) {
                progression[j] = Integer.toString(start + step * j);
            }
            rightAnswers[i] = progression[hideIndex];
            progression[hideIndex] = "..";
            questions[i] = String.join(" ", progression);


        }
        return new String[][]{rules, questions, rightAnswers};

    }
}
