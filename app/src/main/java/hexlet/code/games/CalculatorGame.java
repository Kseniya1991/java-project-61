package hexlet.code.games;

import hexlet.code.AddVariable;
import hexlet.code.Engine;

public class CalculatorGame {
    public static final int MENU_ITEM = 3;
    public static void startCalculatorGame() {
        Engine.run(AddVariable.createRules("What is the result of the expression?"),
                AddVariable.createQuestionAnswerArray(MENU_ITEM));
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        final int countOfOperations = 3;
        String[] operations = {"+", "-", "*"};

        int firstNumber = (int) (Math.random() * Engine.NUMBER_RANGE);
        int indexOfOperation = (int) (Math.random() * countOfOperations);
        int secondNumber = (int) (Math.random() * Engine.NUMBER_RANGE);
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
                break;
        }
        result[0] =  firstNumber + " " + operations[indexOfOperation] + " " + secondNumber;
        result[1] = String.valueOf(numberResult);

        return result;
    }
}
