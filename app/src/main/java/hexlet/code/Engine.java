package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner;
    private static String userName;
    private static String userAnswer;
    private static String correctAnswer;

    public static void greeting(String condition) {
        scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
    }

    public static boolean play(String question, String correctAns) {
        correctAnswer = correctAns;
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        userAnswer = scanner.next();
        return userAnswer.equals(correctAnswer);
    }

    public static void showCorrectMessage() {
        System.out.println("Correct!");
    }

    public static void showWrongMessage() {
        scanner.close();
        var message = new StringBuilder();
        message.append("'").append(userAnswer);
        message.append("' is wrong answer ;(.Correct answer was '");
        message.append(correctAnswer).append("'.\n");
        message.append("Let's try again, ").append(userName).append("!");
        System.out.println(message);
    }

    public static void showCongratulations() {
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
