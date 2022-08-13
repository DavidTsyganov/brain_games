package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int AMOUNT_OF_ELEMENTS = 10;
    private static final int UPPER_BOUND_FOR_NUMBERS = 100;
    private static final int BOUND_FOR_STEP = 10;

    public static String[][] getResult() {
        String[][] questionsAndAnswers = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int startOfProgression = Utils.getRandomNumber(UPPER_BOUND_FOR_NUMBERS);
            int step = Utils.getRandomNumber(BOUND_FOR_STEP) + 1;
            int indexOfHiddenElement = Utils.getRandomNumber(AMOUNT_OF_ELEMENTS);

            int rightAnswer = 0;
            StringBuilder progression = new StringBuilder();
            int currentElement = startOfProgression;

            for (int j = 0; j < AMOUNT_OF_ELEMENTS; j++) {
                if (j == indexOfHiddenElement) {
                    progression.append(" ..");
                    rightAnswer = currentElement;
                } else {
                    progression.append(" " + currentElement);
                }
                currentElement = currentElement + step;
            }
            questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = progression.toString().trim();
            questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(rightAnswer);

            ++i;
        }

        return questionsAndAnswers;
    }

    public static void playGame() {
        Engine.playGame(getResult(), TASK);
    }
}
