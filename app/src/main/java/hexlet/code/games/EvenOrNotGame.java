package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class EvenOrNotGame {
    public static void startEvenGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count < 3) {
            int number = (int) (Math.random() * 100);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            if (!(answer.equals("no")) && !(answer.equals("yes"))) {
                System.out.println(answer + " is wrong answer ;(. \nLet's try again, " + username + "!");
                break;
            }

            if ((number % 2 == 0 && answer.equals("yes")) || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
            }

            if ((number % 2 == 0 && answer.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'. "
                        + "\nLet's try again, " + username + "!");
            }

            if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'. "
                        + "\nLet's try again, " + username + "!");
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
