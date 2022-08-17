package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final String TASK = "What is the result of the expression?";
    public static final int BOUND_FOR_RANDOM_NUMBERS = 100;
    public static final int BOUND_FOR_OPERATORS = 3;

    public static String[][] getResult() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int numberOfOperation = Utils.getRandomNumber(BOUND_FOR_OPERATORS);
            int firstNumber = Utils.getRandomNumber(BOUND_FOR_RANDOM_NUMBERS);
            int secondNumber = Utils.getRandomNumber(BOUND_FOR_RANDOM_NUMBERS);

            switch (numberOfOperation) {
                case 0:
                    roundsData[i][0] = String.valueOf(firstNumber)
                            + " + "
                            + String.valueOf(secondNumber);
                    roundsData[i][1] = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    roundsData[i][0] = String.valueOf(firstNumber)
                            + " - "
                            + String.valueOf(secondNumber);
                    roundsData[i][1] = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    roundsData[i][0] = String.valueOf(firstNumber)
                            + " * "
                            + String.valueOf(secondNumber);
                    roundsData[i][1] = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    System.out.println("There's no such operator");

            }
            ++i;
        }
        return roundsData;
    }

    public static void run() {
        Engine.run(getResult(), TASK);
    }

}
