package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class CalculatorGame {
    public static void startCalculatorGame() {
        Cli.sayHi();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
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

            System.out.println("What is the result of the expression?\nQuestion: "
                    + firstNumber + nameOfOperation + secondNumber + "\nYour answer: ");
            int answer = scanner.nextInt();
            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + result + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
