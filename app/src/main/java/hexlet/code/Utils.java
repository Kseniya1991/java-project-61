package hexlet.code;

import hexlet.code.games.EvenOrNotGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GreatestCommonDivisorGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeNumberGame;

public class Utils {
    public static int generateRandomNumber(int numberRange) {
        return (int) (Math.random() * numberRange);
    }

    public static String[][] createMatrix() {
        return new String[Engine.ROUNDS_COUNT][2];
    }

    public static String[][] method(int gameId) {
        String[][] result = Utils.createMatrix();
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            if (gameId == EvenOrNotGame.MENU_ITEM) {
                result[i] = EvenOrNotGame.createQuestionAndAnswer();
            }
            if (gameId == CalculatorGame.MENU_ITEM) {
                result[i] = CalculatorGame.createQuestionAndAnswer();
            }
            if (gameId == GreatestCommonDivisorGame.MENU_ITEM) {
                result[i] = GreatestCommonDivisorGame.createQuestionAndAnswer();
            }
            if (gameId == ProgressionGame.MENU_ITEM) {
                result[i] = ProgressionGame.createQuestionAndAnswer();
            }
            if (gameId == PrimeNumberGame.MENU_ITEM) {
                result[i] = PrimeNumberGame.createQuestionAndAnswer();
            }
        }
        return result;
    }
}
