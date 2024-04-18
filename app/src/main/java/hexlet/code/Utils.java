package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int numberRange) {
        return (int) (Math.random() * numberRange);
    }

    public static String[][] createMatrix() {
        return new String[Engine.ROUNDS_COUNT][2];
    }
}
