package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final String TASK = "Answer 'yes' if the given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BOUND_FOR_NUMBER = 100;

    public static String[][] getResult() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int number = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBER) + 1;
            roundsData[i][0] = String.valueOf(number);
            String answer = "yes";

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    answer = "no";
                    break;
                }
            }

            roundsData[i][1] = answer;

            ++i;
        }

        return roundsData;
    }

    public static void run() {
        Engine.run(getResult(), TASK);
    }

}
