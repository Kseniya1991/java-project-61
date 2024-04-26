package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int NUMBER_RANGE = 100;
    public static final int START_WITH = 1;
    public static String[][] questionAnswer = Utils.createMatrix();

    public static void run(String rules, String[][] questionAnswer) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count != ROUNDS_COUNT) {
            System.out.println(rules);
            System.out.println("Question: " + questionAnswer[count][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(questionAnswer[count][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'"  + " is wrong answer ;(. "
                        + "Correct answer was '" + questionAnswer[count][1] + "'. "
                        + "\nLet's try again, " + username + "!");
                break;
            }
        }
        if (count == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}


