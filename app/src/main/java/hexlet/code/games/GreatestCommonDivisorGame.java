package hexlet.code.games;

import java.util.Scanner;

public class GreatestCommonDivisorGame {
    public static void startGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;

        while (count < 3) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int max = Math.max(firstNumber, secondNumber);
            int min = Math.min(firstNumber, secondNumber);
            int result = 0;
            int modulo = max % min;

            if (min == 0) {
                result = max;
            }

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
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was '" + result + "'. \nLet's try again, " + username + "!");
                break;
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
