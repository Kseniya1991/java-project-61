package hexlet.code.games;

import hexlet.code.Engine;

public class GreatestCommonDivisorGame {
    public static void startGame() {
        String rules = "Find the greatest common divisor of given numbers."; //правила
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2]; //три массива нагенерить три раза

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int firstNumber = (int) (Math.random() * 100);
        int secondNumber = (int) (Math.random() * 100);
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        int modulo = max % min; //остаток от деления

        result[0] = firstNumber + " " + secondNumber;

        if (min == 0) {
            result[1] = String.valueOf(max);
        }

        if (modulo == 0) {
            result[1] = String.valueOf(min);
        } else {
            while (modulo != 0) {
                int temp = min % modulo;
                min = modulo;
                modulo = temp;
            }
            result[1] = String.valueOf(min);
        }

        return result;
    }
}
