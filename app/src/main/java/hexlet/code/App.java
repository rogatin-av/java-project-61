package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.next());

        switch (choice) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Engine.start(new Even());
                break;
            case 3:
                Engine.start(new Calc());
                break;
            case 4:
                Engine.start(new GCD());
                break;
            default:
                // for checkstyle0
        }

        scanner.close();
    }
}
