package hexlet.code.games;

import hexlet.code.Engine;

public class CalculatorGame {
    public static final int MENU_ITEM = 3;
    public static void startCalculatorGame() {
        String rules = "What is the result of the expression?";
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        final int countOfOperations = 3;
        String[] operations = {"+", "-", "*"};

        int firstNumber = (int) (Math.random() * Engine.NUMBER_RANGE);
        int indexOfOperation = (int) (Math.random() * countOfOperations);
        int secondNumber = (int) (Math.random() * Engine.NUMBER_RANGE);
        String nameOfOperation = "";
        int numberResult = 0;

        switch (indexOfOperation) {
            case (0):
                numberResult = Math.addExact(firstNumber, secondNumber);
                nameOfOperation = operations[0];
                break;
            case (1):
                numberResult = Math.subtractExact(firstNumber, secondNumber);
                nameOfOperation = operations[1];
                break;
            case (2):
                numberResult = Math.multiplyExact(firstNumber, secondNumber);
                nameOfOperation = operations[2];
                break;
            default:
                break;
        }
        result[0] =  firstNumber + " " + nameOfOperation + " " + secondNumber;
        result[1] = String.valueOf(numberResult);

        return result;
    }
}
