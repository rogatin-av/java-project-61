package hexlet.code;

import hexlet.code.games.GameInterface;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner;
    private static GameInterface game;
    private static String userName = "Guest";
    private static boolean isWin = true;

    public static void start(GameInterface currentGame) {
        var questCount = 3;
        game = currentGame;
        scanner = new Scanner(System.in);

        greeting();
        showCondition();
        play(questCount);

        scanner.close();
    }

    private static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    private static void showCondition() {
        System.out.println(game.getCondition());
    }

    private static void play(int questCount) {

        for (var i = 1; i <= questCount; i++) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            isWin = game.checkAnswer(userAnswer);

            if (isWin) {
                System.out.println("Correct!");
            } else {
                var wrong = "'" + userAnswer + "' is wrong answer ;(.";
                var correct = "Correct answer was '" + game.getCorrectAnswer() + "'.";
                System.out.println(wrong + " " + correct);
                System.out.println("Let's try again, " + userName);
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
