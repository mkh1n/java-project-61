package hexlet.code.games;

public class Even {
    public static String[][] main() {
        String[] rules = new String[]{"Answer 'yes' if the number is even, otherwise answer 'no'."};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            var randomNumber = (int) Math.floor(Math.random() * 100);
            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
