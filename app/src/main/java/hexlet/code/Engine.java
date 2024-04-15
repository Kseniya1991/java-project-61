package hexlet.code;

import hexlet.code.games.EvenOrNotGame;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3; //количество раундов максимально 3
    public static void run(String rules, String[] questionAnswer) {
        Scanner scanner = new Scanner(System.in); //приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");

        int count = 0;
        while (count != ROUNDS_COUNT) {
            System.out.println(rules); //правила
            String[] condition = EvenOrNotGame.createQuestionAndAnswer(); //генерация массива с вопросом-ответом
            System.out.println("Question: " + condition[0]); //"Question: "
            System.out.println("Your answer: "); //"Your answer: "
            String answer = scanner.next();

            if (answer.equals(condition[1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'. "
                        + "\nLet's try again, " + username + "!");
                break;
            }
        }
        if (count == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}


