package hexlet.code.games;

public class Prime {
    // CHECKSTYLE DISABLE MagicNumber

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
    public static String[][] main() {
        int gameToolsLen = 3;
        String[] rules = new String[]{"Answer 'yes' if given number is prime. Otherwise answer 'no'."};
        String[] questions = new String[gameToolsLen];
        String[] rightAnswers = new String[gameToolsLen];
        for (int i = 0; i < gameToolsLen; i += 1) {
            int hundred = 100;
            var randomNumber = (int) Math.floor(Math.random() * hundred);
            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
