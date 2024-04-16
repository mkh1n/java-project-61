package hexlet.code.games;

public class Even {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        int gameToolsLen = 3;
        String[] rules = new String[]{"Answer 'yes' if the number is even, otherwise answer 'no'."};
        String[] questions = new String[gameToolsLen];
        String[] rightAnswers = new String[gameToolsLen];
        for (int i = 0; i < gameToolsLen; i += 1) {
            int hundred = 100;
            var randomNumber = (int) Math.floor(Math.random() * hundred);
            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
