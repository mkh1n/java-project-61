package hexlet.code;

public class Rand {
    private final static int HUNDRED = 100;
    public static int getRandomNumber() {
        return (int) Math.floor(Math.random() * HUNDRED);
    }
}
