package hexlet.code.games;

public class Gcd {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static String[][] main() {
        final int gameToolsLen = 3;
        String[] rules = new String[]{"Find the greatest common divisor of given numbers."};
        String[] questions = new String[gameToolsLen];
        String[] rightAnswers = new String[gameToolsLen];
        for (int i = 0; i < gameToolsLen; i += 1) {
            final int hundred = 100;
            int firstNumber = (int) Math.floor(Math.random() * hundred);
            int secondNumber = (int) Math.floor(Math.random() * hundred);
            questions[i] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            rightAnswers[i] = Integer.toString(gcdByEuclidsAlgorithm(firstNumber, secondNumber));
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
