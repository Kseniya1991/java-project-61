package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class EvenOrNotGame {
    public static final int MENU_ITEM = 2;
    public static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int number = Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        result[0] = String.valueOf(number);
        if (isEven(number)) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
