package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner;
    public static final int NUM_OF_ROUNDS = 3;

    public static void play(String condition, String[] questions, String[] correctAns) {
        scanner = new Scanner(System.in);
        var isWin = true;
        var userName = greeting();
        showCondition(condition);
        for (int i = 0; i < NUM_OF_ROUNDS; i++) {
            var correctAnswer = correctAns[i];
            var question = questions[i];
            var userAnswer = askQuestion(question);
            if (userAnswer.equals(correctAnswer)) {
                showCorrectMessage();
            } else {
                showWrongMessage(userName, userAnswer, correctAnswer);
                isWin = false;
                break;
            }
        }
        if (isWin) {
            showCongratulations(userName);
        }
        scanner.close();
    }

    private static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    private static void showCondition(String condition) {
        System.out.println(condition);
    }

    private static String askQuestion(String question) {
        var userAnswer = "";
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        userAnswer = scanner.next();
        return userAnswer;
    }

    private static void showCorrectMessage() {
        System.out.println("Correct!");
    }

    private static void showWrongMessage(String userName, String userAnswer, String correctAnswer) {
        scanner.close();
        var message = new StringBuilder();
        message.append("'").append(userAnswer);
        message.append("' is wrong answer ;(.Correct answer was '");
        message.append(correctAnswer).append("'.\n");
        message.append("Let's try again, ").append(userName).append("!");
        System.out.println(message);
    }

    private static void showCongratulations(String userName) {
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
