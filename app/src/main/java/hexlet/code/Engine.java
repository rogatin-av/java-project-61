package hexlet.code;

import hexlet.code.games.GameInterface;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner;
    private static GameInterface game;
    private static String userName = "Guest";
    private static boolean isWin = true;
    private static final int QUEST_COUNT = 3;

    public static void start(GameInterface currentGame) {
        game = currentGame;
        scanner = new Scanner(System.in);

        greeting();
        showCondition();
        play();

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

    private static void play() {

        for (var i = 1; i <= QUEST_COUNT; i++) {

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
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static int generateRandomInRange(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

    public static String primeChecker(int num) {
        for (var i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
