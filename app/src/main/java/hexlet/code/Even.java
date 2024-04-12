package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void startEvenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                "Question: " + (int) (Math.random() * 100));
        System.out.println("Your answer: ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

    }
}
