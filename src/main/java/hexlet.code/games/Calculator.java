package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final char[] OPERATIONS = {'+', '-', '*'};
    public static final String TASK = "What is the result of the expression?";
    public static final int BOUND_FOR_RANDOM_NUMBERS = 100;


    public static String[] generateRoundData() {
        String[] roundData = new String[2];


        int numberOfOperation = Utils.generateRandomNumber(OPERATIONS.length);
        int firstNumber = Utils.generateRandomNumber(BOUND_FOR_RANDOM_NUMBERS);
        int secondNumber = Utils.generateRandomNumber(BOUND_FOR_RANDOM_NUMBERS);

        switch (OPERATIONS[numberOfOperation]) {
            case 0:
                roundData[0] = String.valueOf(firstNumber)
                        + " + "
                        + String.valueOf(secondNumber);
                roundData[1] = String.valueOf(firstNumber + secondNumber); // Здесь будет метод calculate()
                break;

            case 1:
                roundData[0] = String.valueOf(firstNumber)
                        + " - "
                        + String.valueOf(secondNumber);
                roundData[1] = String.valueOf(firstNumber - secondNumber); // Здесь будет метод calculate()
                break;
            case 2:
                roundData[0] = String.valueOf(firstNumber)
                        + " * "
                        + String.valueOf(secondNumber);
                roundData[1] = String.valueOf(firstNumber * secondNumber); // Здесь будет метод calculate()
                break;
            default:
                System.out.println("There's no such operator");
        }

        return roundData;
    }

//    public static int calculate(int number1, int number2, char operation) {
//        int result = 0;
//        switch (operation) {
//            case '+':
//                roundData[0] = String.valueOf(firstNumber)
//                        + " + "
//                        + String.valueOf(secondNumber);
//                roundData[1] = String.valueOf(firstNumber + secondNumber);
//                break;
//
//            case '-':
//                roundData[0] = String.valueOf(firstNumber)
//                        + " - "
//                        + String.valueOf(secondNumber);
//                roundData[1] = String.valueOf(firstNumber - secondNumber);
//                break;
//            case '*':
//                roundData[0] = String.valueOf(firstNumber)
//                        + " * "
//                        + String.valueOf(secondNumber);
//                roundData[1] = String.valueOf(firstNumber * secondNumber);
//                break;
//            default:
//                System.out.println("There's no such operator");
//        }
//        return result;
//    }

    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.AMOUNT_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(roundsData, TASK);
    }
}
