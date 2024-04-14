package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class ProgressionGame {
    public static void startProgressionGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;

        while (count < 3) {
            int begin = (int) (Math.random() * 50);
            int summWith = (int) (Math.random() * 10);

            int[] progression = new int[10];

            for (int i = 0; i < progression.length; i++) {
                if (i == 0) {
                    progression[i] = begin + summWith;
                } else {
                    progression[i] = progression[i - 1] + summWith;
                }
            }

            int result = progression[(int) (Math.random() * 9)];

            System.out.print("What number is missing in the progression?\nQuestion: " + result);

            for (int i = 0; i < progression.length; i++) {
                if (progression[i] != result) {
                    System.out.print(progression[i] + " ");
                } else {
                    System.out.print(".. ");
                }
            }

            System.out.println();
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct answer was '" + result + "'. \nLet's try again, " + username + "!");
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
