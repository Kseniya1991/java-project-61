package hexlet.code.games;

import hexlet.code.Engine;

public class EvenOrNotGame {
    public static void startEvenGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'."; //правила
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2]; //три массива нагенерить три раза

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int number = (int) (Math.random() * 100);
        result[0] = String.valueOf(number); //question

        if (number % 2 == 0) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }
}
