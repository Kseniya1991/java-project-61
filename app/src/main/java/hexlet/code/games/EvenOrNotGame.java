package hexlet.code.games;

import hexlet.code.AddVariable;
import hexlet.code.Engine;

public class EvenOrNotGame {
    public static final int MENU_ITEM = 2;
    public static void startEvenGame() {
        Engine.run(AddVariable.createRules("Answer 'yes' if the number is even, otherwise answer 'no'."),
                AddVariable.createQuestionAnswerArray(MENU_ITEM));
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int number = (int) (Math.random() * Engine.NUMBER_RANGE);
        result[0] = String.valueOf(number);

        if (number % 2 == 0) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }
}
