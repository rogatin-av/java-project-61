package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void start() {
        var questCount = 3;
        var isWin = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 1; i <= questCount; i++) {
            isWin = play(userName, scanner);

            if (!isWin) {
                break;
            }
        }

        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }

    public static boolean play(String userName, Scanner scanner) {
        var num = (int) (Math.random() * 100 + 1);
        String correct = (num % 2 == 0) ? "yes" : "no";

        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (answer.equals(correct)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correct + "'.");
            System.out.println("Let's try again, " + userName);
            return false;
        }
    }
}
