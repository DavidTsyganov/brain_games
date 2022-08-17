package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if number is even otherwise answer 'no'.";
    private static final int BOUND_FOR_RANDOM = 100;

    public static String[][] getResult() {
        String[][] questionsAndAnswers = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int number = Utils.getRandomNumber(BOUND_FOR_RANDOM);
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(number);

            boolean even = (number % 2 == 0);
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = even ? "yes" : "no";

            ++i;

        }

        return questionsAndAnswers;
    }

    public static void run() {
        Engine.run(getResult(), TASK);
    }
}
