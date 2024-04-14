package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class EvenOrNotGame {
    public static void startEvenGame() {
        Cli.sayHi();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        int count = 0;
        while (count < 3) {
            int number = (int) (Math.random() * 100);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + number);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();

            if (!(answer.equals("no")) && !(answer.equals("yes"))) {
                System.out.println(answer + " is wrong answer ;(. \nLet's try again, " + userName + "!");
                break;
            }

            if ((number % 2 == 0 && answer.equals("yes")) || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                count++;
            }

            if ((number % 2 == 0 && answer.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'. "
                        + "\nLet's try again, " + userName + "!");

            }
            if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'. "
                        + "\nLet's try again, " + userName + "!");

            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
