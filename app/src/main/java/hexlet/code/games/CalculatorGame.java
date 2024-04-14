package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class CalculatorGame {
    public static void startCalculatorGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count < 3) {
            int indexOfOperation = (int) (Math.random() * 3);
            String nameOfOperation = "";
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);

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
            int result = 0;

            switch (indexOfOperation) {
                case (0):
                    result = Math.addExact(firstNumber, secondNumber);
                    break;
                case (1):
                    result = Math.subtractExact(firstNumber, secondNumber);
                    break;
                case (2):
                    result = Math.multiplyExact(firstNumber, secondNumber);
                    break;
                default:
                    break;
            }

            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + firstNumber + nameOfOperation + secondNumber);
            System.out.println("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + result + "'. \nLet's try again, " + username + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
