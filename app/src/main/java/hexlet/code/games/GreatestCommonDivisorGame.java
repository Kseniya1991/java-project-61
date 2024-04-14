package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GreatestCommonDivisorGame {
    public static void startGame() {
        Cli.sayHi();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        int count = 0;

        while (count < 3) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int max = Math.max(firstNumber, secondNumber);
            int min = Math.min(firstNumber, secondNumber);
            int result = 0;
            int modulo = max % min;

            if (modulo == 0) {
                result = min;
            } else {
                while (modulo != 0) {
                    int temp = min % modulo;
                    min = modulo;
                    modulo = temp;
                }
                result = min;
            }
            System.out.println("Find the greatest common divisor of given numbers.\n" +
                    "Question: " + firstNumber + " " + secondNumber);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'. \nLet's try again, " + userName + "!");
                break;
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

