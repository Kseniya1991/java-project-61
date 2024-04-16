package hexlet.code.games;

import hexlet.code.Engine;

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
        int[] progression = new int[10]; //массив вопрос, список чисел
        int begin = (int) (Math.random() * 10); //начальное число, исключая ноль
        int summWith = 1 + (int) (Math.random() * 10); //число, на которое увеличивают предыдущее
        //progression[0] = begin; //начальное число в массиве

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + summWith;
        }

        int answer = progression[(int) (Math.random() * 9)]; //задаем число-ответ
        result[1] = answer + "";
        String question = "";

        for (int i = 1; i < progression.length; i++) {
            if (progression[i] == answer) {
                question += ".. ";
            } else {
                question += progression[i] + " ";
            }
        }

        result[0] = question;

        return result;
    }
}
