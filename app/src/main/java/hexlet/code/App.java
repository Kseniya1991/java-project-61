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
        gameRun(choice);
    }

    public static void gameRun(int point) {
        if (point == Cli.menuItem) {
            Cli.sayHi();
        } else if (point == EvenOrNotGame.menuItem) {
            EvenOrNotGame.startEvenGame();
        } else if (point == CalculatorGame.menuItem) {
            CalculatorGame.startCalculatorGame();
        } else if (point == GreatestCommonDivisorGame.menuItem) {
            GreatestCommonDivisorGame.startGame();
        } else if (point == ProgressionGame.menuItem) {
            ProgressionGame.startProgressionGame();
        } else if (point == PrimeNumberGame.menuItem) {
            PrimeNumberGame.startPrimeNumberGame();
        }
    }

    public static void printMenu() {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet" + "\n2 - Even" + "\n3 - Calculator" + "\n4 - GCD"
                + "\n5 - Progression" + "\n6 - Prime" + "\n0 - Exit" + "\nYour choice: ");
    }
}
