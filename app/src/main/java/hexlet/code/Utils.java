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

    public static String[][] createMatrix(int id) {
        String[][] result = new String[Engine.ROUNDS_COUNT][2];
        switch (id) {
            case (EvenOrNotGame.MENU_ITEM):
                for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                    result[i] = EvenOrNotGame.createQuestionAndAnswer();
                }
                break;
            case (CalculatorGame.MENU_ITEM):
                for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                    result[i] = CalculatorGame.createQuestionAndAnswer();
                }
                break;
            case (GreatestCommonDivisorGame.MENU_ITEM):
                for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                    result[i] = GreatestCommonDivisorGame.createQuestionAndAnswer();
                }
                break;
            case (ProgressionGame.MENU_ITEM):
                for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                    result[i] = ProgressionGame.createQuestionAndAnswer();
                }
                break;
            case (PrimeNumberGame.MENU_ITEM):
                for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                    result[i] = PrimeNumberGame.createQuestionAndAnswer();
                }
                break;
            default:
                break;
        }
        return result;
    }
}
