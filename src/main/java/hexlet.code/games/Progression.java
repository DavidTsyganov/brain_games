package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int AMOUNT_OF_ELEMENTS = 10;
    private static final int UPPER_BOUND_FOR_NUMBERS = 100;
    private static final int BOUND_FOR_STEP = 10;

    public static String[][] getResult() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int startOfProgression = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBERS);
            int step = Utils.generateRandomNumber(BOUND_FOR_STEP) + 1;
            int indexOfHiddenElement = Utils.generateRandomNumber(AMOUNT_OF_ELEMENTS);

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
            roundsData[i][0] = progression.toString().trim();
            roundsData[i][1] = String.valueOf(rightAnswer);

            ++i;
        }

        return roundsData;
    }

    public static void run() {
        Engine.run(getResult(), TASK);
    }
}
