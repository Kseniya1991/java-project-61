package hexlet.code.games;

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
            System.out.println("Answer 'yes' if given number is prime. Otherwise result 'no'.");
            System.out.println("Question: " + number);

            if (number < 2) {
                result = "no";
            }

            int countOfDividers = 3;
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
                if (count >= countOfDividers) {
                    result = "no";
                }
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
