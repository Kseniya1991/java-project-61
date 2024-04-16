package hexlet.code;

import hexlet.code.games.EvenOrNotGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GreatestCommonDivisorGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeNumberGame;

public class AddVariable {
    public static String createRules(String rules) {
        return rules;
    }

    public static String[][] createQuestionAnswerArray(int gameId) {
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2];
            for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
                if (gameId == EvenOrNotGame.MENU_ITEM) {
                    questionAnswer[i] = EvenOrNotGame.createQuestionAndAnswer();
                }
                if (gameId == CalculatorGame.MENU_ITEM) {
                    questionAnswer[i] = CalculatorGame.createQuestionAndAnswer();
                }
                if (gameId == GreatestCommonDivisorGame.MENU_ITEM) {
                    questionAnswer[i] = GreatestCommonDivisorGame.createQuestionAndAnswer();
                }
                if (gameId == ProgressionGame.MENU_ITEM) {
                    questionAnswer[i] = ProgressionGame.createQuestionAndAnswer();
                }
                if (gameId == PrimeNumberGame.MENU_ITEM) {
                    questionAnswer[i] = PrimeNumberGame.createQuestionAndAnswer();
                }
        }
            return questionAnswer;
    }
}
