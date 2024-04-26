package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class GreatestCommonDivisorGame {
    public static final int MENU_ITEM = 4;
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int firstNumber = 1 + Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        int secondNumber = 1 + Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        result[0] = firstNumber + " " + secondNumber;
        result[1] = String.valueOf(getAnswer(min, max));
        return result;
    }

    public static int getAnswer(int min, int max) {
        int result = 0;
        if (max == 0) {
            result = max;
        } else if (max % min == 0) {
            result = min;
        } else {
            int modulo = max % min;
            while (modulo != 0) {
                int temp = min % modulo;
                min = modulo;
                modulo = temp;
            }
            result = min;
        }
        return result;
    }
}
