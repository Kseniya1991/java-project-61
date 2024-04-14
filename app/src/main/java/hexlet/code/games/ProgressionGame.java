package hexlet.code.games;

import java.util.Scanner;

public class ProgressionGame {
    public static void startProgressionGame() {
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;

        while (count < 3) {
            int summWith = (int) (Math.random() * 10);
            int[] progression = new int[10];

            for (int i = 0; i < progression.length; i++) {
                if (i == 0) {
                    progression[0] = (int) (Math.random() * 10);
                } else {
                    progression[i] = progression[i - 1] + summWith;
                }
            }

            int result = progression[(int) (Math.random() * 9)];

            System.out.println("What number is missing in the progression?");
            System.out.print("Question: ");

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
                break;
            }
        }

        if (count == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
