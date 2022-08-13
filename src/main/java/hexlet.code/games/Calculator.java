package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final String TASK = "What is the result of the expression?";
    public static final int BOUND_FOR_RANDOM_NUMBERS = 100;
    public static final int BOUND_FOR_OPERATORS = 3;

    public static String[][] getResult() {
        String[][] questionsAndAnswers = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int numberOfOperation = Utils.getRandomNumber(BOUND_FOR_OPERATORS);
            int firstNumber = Utils.getRandomNumber(BOUND_FOR_RANDOM_NUMBERS);
            int secondNumber = Utils.getRandomNumber(BOUND_FOR_RANDOM_NUMBERS);

            switch (numberOfOperation) {
                case 0:
                    questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(firstNumber)
                            + " + "
                            + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(firstNumber + secondNumber);
                    break;
                case 1:
                    questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(firstNumber)
                            + " - "
                            + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(firstNumber - secondNumber);
                    break;
                case 2:
                    questionsAndAnswers[i][Engine.QUESTIONS_INDEX] = String.valueOf(firstNumber)
                            + " * "
                            + String.valueOf(secondNumber);
                    questionsAndAnswers[i][Engine.ANSWERS_INDEX] = String.valueOf(firstNumber * secondNumber);
                    break;
                default:
                    System.out.println("There's no such operator");

            }
            ++i;
        }
        return questionsAndAnswers;
    }

    public static void playGame() {
        Engine.playGame(getResult(), TASK);
    }

}
