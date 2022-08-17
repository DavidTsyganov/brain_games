package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int UPPER_BOUND_FOR_NUMBERS = 100;

    public static String[] generateRoundData() {
        String[] roundData = new String[2];

        int firstNumber = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBERS);
        int secondNumber = Utils.generateRandomNumber(UPPER_BOUND_FOR_NUMBERS);

        roundData[0] = firstNumber + " " + secondNumber;

        roundData[1] = String.valueOf(calculateGCD(firstNumber, secondNumber));

        return roundData;
    }

    public static int calculateGCD(int number1, int number2) {
        int gcd = 1;
        int edge = number1 <= number2 ? number1 : number2;

        for (int i = 2; i < edge; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(roundsData, TASK);
    }

}
