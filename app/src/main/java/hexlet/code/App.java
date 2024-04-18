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
        switch (point) {
            case (Cli.MENU_ITEM):
                Cli.sayHi();
                break;
            case (EvenOrNotGame.MENU_ITEM):
                EvenOrNotGame.startEvenGame();
                break;
            case (CalculatorGame.MENU_ITEM):
                CalculatorGame.startCalculatorGame();
                break;
            case (GreatestCommonDivisorGame.MENU_ITEM):
                GreatestCommonDivisorGame.startGame();
                break;
            case (ProgressionGame.MENU_ITEM):
                ProgressionGame.startProgressionGame();
                break;
            case (PrimeNumberGame.MENU_ITEM):
                PrimeNumberGame.startPrimeNumberGame();
                break;
            default:
                break;
        }
    }

    public static void printMenu() {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet" + "\n2 - Even" + "\n3 - Calculator" + "\n4 - GCD"
                + "\n5 - Progression" + "\n6 - Prime" + "\n0 - Exit" + "\nYour choice: ");
    }
}
