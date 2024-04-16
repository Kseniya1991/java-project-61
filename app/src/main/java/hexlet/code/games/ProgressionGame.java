package hexlet.code.games;

import hexlet.code.AddVariable;
import hexlet.code.Engine;

public class ProgressionGame {
    public static final int MENU_ITEM = 5;
    public static void startProgressionGame() {
        Engine.run(AddVariable.createRules("What number is missing in the progression?"),
                AddVariable.createQuestionAnswerArray(MENU_ITEM));
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2]; //массив вопрос-ответ
        final int progressionLength = 10;
        int indexOfHidden = 1 + (int) (Math.random() * progressionLength - 1);
        int begin = (int) (Math.random() * Engine.NUMBER_RANGE); //начальное число, исключая ноль
        final int minDifference = 1;
        int difference = minDifference + (int) (Math.random() * progressionLength);
        int[] progression = new int[progressionLength]; //массив вопрос, список чисел
        progression[0] = begin;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }

        int answer = progression[indexOfHidden]; //задаем число-ответ
        result[1] = String.valueOf(answer);
        result[0] = String.valueOf(begin);

        for (int i = 1; i < progression.length; i++) {
            result[0] += " ";
            if (i == indexOfHidden) {
                result[0] += "..";
            } else {
                result[0] += String.valueOf(begin + difference * i);
            }
        }

        return result;
    }
}
