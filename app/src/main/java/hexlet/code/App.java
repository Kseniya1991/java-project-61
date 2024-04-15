package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calculator"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case (1):
                Cli.sayHi(); //только приветствие
                break;
            case (2):
                EvenOrNotGame.startEvenGame();
                break;
            case (3):
                CalculatorGame.startCalculatorGame();
                break;
            case (4):
                GreatestCommonDivisorGame.startGame();
                break;
            case (5):
                ProgressionGame.startProgressionGame();
                break;
            case (6):
                PrimeNumberGame.startPrimeNumberGame();
                break;
            default:
                break;
        }
    }
}
