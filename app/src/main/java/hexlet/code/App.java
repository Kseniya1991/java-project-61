package hexlet.code;

import hexlet.code.games.EvenOrNotGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GreatestCommonDivisorGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeNumberGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        App.gameRun(choice);
    }

    public static void gameRun(int point) {
        String[][] questionAnswer = Utils.createMatrix();
        String rules = "";
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            if (point == Cli.MENU_ITEM) {
                Cli.sayHi();
            }
            if (point == EvenOrNotGame.MENU_ITEM) {
                questionAnswer[i] = EvenOrNotGame.createQuestionAndAnswer();
            }
            if (point == CalculatorGame.MENU_ITEM) {
                questionAnswer[i] = CalculatorGame.createQuestionAndAnswer();
            }
            if (point == GreatestCommonDivisorGame.MENU_ITEM) {
                questionAnswer[i] = GreatestCommonDivisorGame.createQuestionAndAnswer();
            }
            if (point == ProgressionGame.MENU_ITEM) {
                questionAnswer[i] = ProgressionGame.createQuestionAndAnswer();
            }
            if (point == PrimeNumberGame.MENU_ITEM) {
                questionAnswer[i] = PrimeNumberGame.createQuestionAndAnswer();
            }
        }

        Engine.run(rules, questionAnswer);
    }

    public static void printMenu() {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet" + "\n2 - Even" + "\n3 - Calculator" + "\n4 - GCD"
                + "\n5 - Progression" + "\n6 - Prime" + "\n0 - Exit" + "\nYour choice: ");
    }
}
