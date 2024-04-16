package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumberGame {
    public static void startPrimeNumberGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2]; //массив вопрос-ответ
        int numberRange = 100;
        int number = (int) (Math.random() * numberRange);
        result[0] = String.valueOf(number); //вопрос

        int countOfDividers = 3;
        int counter = 0;

        if (number < 2) {
            result[1] = "no";
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    result[1] = "yes";
                    counter++;
                }
            }
        }

        if (counter >= countOfDividers) {
            result[1] = "no";
        }

        return result;
    }
}
