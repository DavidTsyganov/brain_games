package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int AMOUNT_OF_ROUNDS = 3;

    public static final int QUESTIONS_INDEX = 0;
    public static final int ANSWERS_INDEX = 1;

    public static void run(String[][] questionsAndAnswers, String task) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");

        if (questionsAndAnswers.length == 0 || questionsAndAnswers == null || task == null || task.isEmpty()) {
            return;
        }

        System.out.println(task);

        int i = 0;

        while (i < AMOUNT_OF_ROUNDS) {
            String question = questionsAndAnswers[i][QUESTIONS_INDEX];
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");

            String answer;

            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();

            String rightAnswer = questionsAndAnswers[i][ANSWERS_INDEX];

            if (isCorrectAnswer(answer, rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            ++i;
        }

        System.out.println("Congratulations, " + name + "!");
    }

    public static boolean isCorrectAnswer(String answer, String correctAnswer) {
        if (answer == null || answer.isEmpty()) {
            return false;
        }

        return correctAnswer.equals(answer);
    }
}
