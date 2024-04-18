package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class PrimeNumberGame {
    public static final int MENU_ITEM = 6;
    public static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startPrimeNumberGame() {
        String[][] questionAnswer = Utils.createMatrix();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }
        Engine.run(GAME_RULES, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2]; //массив вопрос-ответ
        int number = Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        result[0] = String.valueOf(number); //вопрос
        if (isPrime(number)) {
            result[1] = "yes";
        } else {
            result[1] = "no";
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int squareNum = (int) (Math.sqrt(number));
        for (int i = 2; i <= squareNum; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
