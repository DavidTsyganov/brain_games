package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final String TASK = "Answer 'yes' if the given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BOUND_FOR_NUMBER = 100;

    public static String[] generateRoundData() {
        String[] roundData = new String[2];

        int number = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBER) + 1;
        roundData[0] = String.valueOf(number);

        roundData[1] = isPrime(number) ? "yes" : "no";

        return roundData;
    }

    public static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, TASK);
    }
}
