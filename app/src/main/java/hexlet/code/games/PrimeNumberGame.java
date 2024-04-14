package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class PrimeNumberGame {
    public static void startPrimeNumberGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count < 3) {
            int number = (int) (Math.random() * 100);
            String result = "";
            System.out.println("Answer 'yes' if given number is prime. "
                    + "Otherwise result 'no'.\nQuestion: " + number);

            if (number > 1) {
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        result = "no";
                        break;
                    } else {
                        result = "yes";
                    }
                }
            } else {
                result = "no";
            }

            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (answer.equals(result)) {
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
