package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if number is even otherwise answer 'no'.";
    private static final int BOUND_FOR_RANDOM = 100;

    public static String[] generateRoundData() {
        String[] roundData = new String[2];

        int number = Utils.generateRandomNumber(BOUND_FOR_RANDOM);

        roundData[0] = String.valueOf(number);
        roundData[1] = isEven(number) ? "yes" : "no";

        return roundData;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void run() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        for (int i = 0; i < Engine.AMOUNT_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(roundsData, TASK);
    }
}
