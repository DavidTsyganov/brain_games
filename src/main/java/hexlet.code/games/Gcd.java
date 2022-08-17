package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int UPPER_BOUND_FOR_NUMBERS = 100;

    public static String[][] getResult() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int firstNumber = Utils.getRandomNumber(UPPER_BOUND_FOR_NUMBERS);
            int secondNumber = Utils.getRandomNumber(UPPER_BOUND_FOR_NUMBERS);

            roundsData[i][0] = firstNumber + " " + secondNumber;

            if (firstNumber == 0 || secondNumber == 0) {
                roundsData[i][1] = "0";
            }

            int gcd = 1;
            int edge = firstNumber <= secondNumber ? firstNumber : secondNumber;

            for (int j = 1; j <= edge; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    gcd = j;
                }
            }

            roundsData[i][1] = String.valueOf(gcd);

            ++i;
        }

        return roundsData;
    }
    public static void run() {
        Engine.run(getResult(), TASK);
    }

}
