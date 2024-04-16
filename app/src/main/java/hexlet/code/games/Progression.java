package hexlet.code.games;

import java.util.Random;

public class Progression {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        String[] rules = new String[]{"What number is missing in the progression?"};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            int length = new Random().nextInt(5) + 5;
            String[] progression = new String[length];
            int step = new Random().nextInt(5) + 2;
            int start = new Random().nextInt(20) + 2;
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
