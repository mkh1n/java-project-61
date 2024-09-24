package hexlet.code;

public class Rand {
    final private static int HUNDRED = 100;
    public static int getRandomNumber() {
        return (int) Math.floor(Math.random() * HUNDRED);
    }
}
