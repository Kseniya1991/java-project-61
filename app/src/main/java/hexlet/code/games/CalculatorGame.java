package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class CalculatorGame {
    public static void startCalculatorGame() {
        String rules = "What is the result of the expression?"; //правила
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][2]; //три массива нагенерить три раза

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            questionAnswer[i] = createQuestionAndAnswer();
        }

        Engine.run(rules, questionAnswer);
    }

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2]; //возвращаемый массив

        int firstNumber = (int) (Math.random() * 100);
        int indexOfOperation = (int) (Math.random() * 3);
        int secondNumber = (int) (Math.random() * 100);
        String nameOfOperation = "";

        switch (indexOfOperation) {
            case (0):
                nameOfOperation = " + ";
                break;
            case (1):
                nameOfOperation = " - ";
                break;
            case (2):
                nameOfOperation = " * ";
                break;
            default:
                break;
        }

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

        result[0] =  firstNumber + " " + nameOfOperation + " " + secondNumber; //вопрос
        result[1] = String.valueOf(numberResult);

        return result;
    }
}