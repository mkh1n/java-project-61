package hexlet.code.games;

import java.math.BigInteger;

public class Prime {
    @SuppressWarnings("checkstyle:<MagicNumber>")

    public static String[][] main() {
        String[] rules = new String[]{"Answer 'yes' if given number is prime. Otherwise answer 'no'."};
        String[] questions = new String[3];
        String[] rightAnswers = new String[3];
        for (int i = 0; i < 3; i += 1) {
            var randomNumber = (int) Math.floor(Math.random() * 100);
            questions[i] = Integer.toString(randomNumber);
            BigInteger bigInteger = BigInteger.valueOf(randomNumber);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(randomNumber));
            rightAnswers[i] = probablePrime ? "yes" : "no";
        }
        return new String[][]{rules, questions, rightAnswers};
    }

}
