package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class ProgressionGame {
    public static void startProgressionGame() {
        String rules = "What number is missing in the progression?";
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2]; //массив вопрос-ответ
        int progressionLength = 10;
        int hiddenNumberIndex = (int) (Math.random() * progressionLength - 1);
        int begin = (int) (Math.random() * Engine.NUMBER_RANGE); //начальное число, исключая ноль
        int summWith = 1 + (int) (Math.random() * 10); //число, на которое увеличивают предыдущее
        int[] progression = new int[progressionLength]; //массив вопрос, список чисел

        for (int i = 0; i < progression.length; i++) {
            if (i == 0) {
                progression[0] = begin;
            } else {
                progression[i] = progression[i - 1] + summWith;
            }
        }

        int answer = progression[hiddenNumberIndex]; //задаем число-ответ
        result[1] = String.valueOf(answer);
        result[0] = begin + " ";

        for (int i = 1; i < progression.length; i++) {
            if (i == hiddenNumberIndex) {
                result[0] += ".. ";
            } else {
                result[0] += progression[i] + " ";
            }
        }

        return result;
    }
}