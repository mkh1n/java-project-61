package hexlet.code.games;

public class Gcd {
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static String[][] main() {
        String[] rules = new String[]{"Find the greatest common divisor of given numbers."};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            int firstNumber = (int) Math.floor(Math.random() * 100);
            int secondNumber = (int) Math.floor(Math.random() * 100);
            questions[i] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            rightAnswers[i] = Integer.toString(gcdByEuclidsAlgorithm(firstNumber, secondNumber));
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
