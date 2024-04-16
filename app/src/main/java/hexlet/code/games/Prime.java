package hexlet.code.games;

import java.math.BigInteger;

public class Prime {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static boolean isPrime(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        String[] rules = new String[]{"Answer 'yes' if given number is prime. Otherwise answer 'no'."};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            var randomNumber = (int) Math.floor(Math.random() * 100);
            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
