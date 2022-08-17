package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int AMOUNT_OF_ELEMENTS = 10;
    private static final int UPPER_BOUND_FOR_NUMBERS = 100;
    private static final int BOUND_FOR_STEP = 10;

    public static String[] generateRoundData() {
        String[] roundData = new String[2];

        int startOfProgression = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBERS);
        int step = Utils.generateRandomNumber(BOUND_FOR_STEP) + 1;
        int indexOfHiddenElement = Utils.generateRandomNumber(AMOUNT_OF_ELEMENTS);

        int[] progression = generateProgression(startOfProgression, step, AMOUNT_OF_ELEMENTS);

        roundData[0] = hideElement(progression, indexOfHiddenElement);
        roundData[1] = String.valueOf(progression[indexOfHiddenElement]);

        return roundData;
    }

    public static int[] generateProgression(int startOfProgression, int step, int sizeOfProgression) {
        int[] progression = new int[sizeOfProgression];
        progression[0] = startOfProgression;

        for (int i = 1; i < sizeOfProgression; i++) {
            progression[i] += progression[i - 1] + step;
        }

        return progression;
    }

    public static String hideElement(int[] progression, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < progression.length; i++) {
            if (i == index) {
                sb.append(" ..");
                continue;
            }
            sb.append(" " + progression[i]);
        }
        return sb.toString();
    }

    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.AMOUNT_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, TASK);
    }
}
