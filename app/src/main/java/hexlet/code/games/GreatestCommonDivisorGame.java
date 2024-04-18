package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class GreatestCommonDivisorGame {
    public static final int MENU_ITEM = 4;
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        String[][] questionAnswer = Utils.createMatrix();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }
        Engine.run(GAME_RULES, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int firstNumber = 1 + Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        int secondNumber = 1 + Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        result[0] = firstNumber + " " + secondNumber;
        result[1] = getAnswer(min, max);

        return result;
    }

    public static String getAnswer(int min, int max) {
        String result = "";
        if (max == 0) {
            result = String.valueOf(max);
        } else if (max % min == 0) {
            result = String.valueOf(min);
        } else {
            int modulo = max % min;
            while (modulo != 0) {
                int temp = min % modulo;
                min = modulo;
                modulo = temp;
            }
            result = String.valueOf(min);
        }

        return result;
    }
}
