package hexlet.code;

import hexlet.code.games.EvenOrNotGame;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3; //количество раундов максимально 3
    public static void run(String rules, String[][] questionAnswer) {
        Scanner scanner = new Scanner(System.in); //приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count != ROUNDS_COUNT) {
            System.out.println(rules); //правила
            System.out.println(Arrays.toString(questionAnswer[count])); //показать сгенерированный массив условий

            System.out.println("Question: " + questionAnswer[count][0]);
            System.out.println("Your answer: ");
            String answer = scanner.next();

            if (!Arrays.asList(questionAnswer[count]).contains(answer)) {
                System.out.println(answer + " is wrong answer ;(."
                        + "\nLet's try again, " + username + "!");
                break;
            }

            if (answer.equals(questionAnswer[count][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "'"  + " is wrong answer ;(."
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


