package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class EvenOrNotGame {
    public static final int MENU_ITEM = 2;
    public static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startEvenGame() {
        String[][] questionAnswer = Utils.createMatrix();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }
        Engine.run(GAME_RULES, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int number = Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        result[0] = String.valueOf(number);
        result[1] = getAnswer(number);

        return result;
    }

    public static String getAnswer(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
}
