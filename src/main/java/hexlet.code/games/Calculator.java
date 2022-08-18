package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final char[] OPERATIONS = {'+', '-', '*'};
    public static final String TASK = "What is the result of the expression?";
    public static final int BOUND_FOR_RANDOM_NUMBERS = 100;
    public static String[] generateRoundData() {
        String[] roundData = new String[2];


        int indexOfOperation = Utils.generateRandomNumber(OPERATIONS.length);
        int firstNumber = Utils.generateRandomNumber(BOUND_FOR_RANDOM_NUMBERS);
        int secondNumber = Utils.generateRandomNumber(BOUND_FOR_RANDOM_NUMBERS);

        roundData[0] = String.valueOf(firstNumber + " " + OPERATIONS[indexOfOperation] + " " + secondNumber);
        roundData[1] = String.valueOf(calculate(firstNumber, secondNumber, OPERATIONS[indexOfOperation]));

        return roundData;
    }
    public static int calculate(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.println("There's no such operation");
        }

        return result;
    }
    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, TASK);
    }
}
