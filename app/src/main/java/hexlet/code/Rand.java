package hexlet.code;

public class Rand {
    private static final int HUNDRED = 100;
    public static int getRandomNumber() {
        return (int) Math.floor(Math.random() * HUNDRED);
    }
}
