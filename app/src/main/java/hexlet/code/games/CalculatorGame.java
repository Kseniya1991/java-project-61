package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalculatorGame {
    public static final int MENU_ITEM = 3;
    public static final String GAME_RULES = "What is the result of the expression?";
    public static final int COUNT_OF_OPERATION = 3;

    public static void startCalculatorGame() {

        Engine.run(GAME_RULES, Utils.method(MENU_ITEM));
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        String[] operations = {"+", "-", "*"};
        int firstNumber = Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        int indexOfOperation = Utils.generateRandomNumber(COUNT_OF_OPERATION);
        int secondNumber = Utils.generateRandomNumber(Engine.NUMBER_RANGE);
        result[0] = firstNumber + " " + operations[indexOfOperation] + " " + secondNumber;
        result[1] = String.valueOf(getAnswer(firstNumber, secondNumber, indexOfOperation));

        return result;
    }

    public static Integer getAnswer(int firstNumber, int secondNumber, int indexOfOperation) {
        int numberResult = 0;
        switch (indexOfOperation) {
            case (0):
                numberResult = Math.addExact(firstNumber, secondNumber);
                break;
            case (1):
                numberResult = Math.subtractExact(firstNumber, secondNumber);
                break;
            case (2):
                numberResult = Math.multiplyExact(firstNumber, secondNumber);
                break;
            default:
                return null;
        }
        return numberResult;
    }
}
