package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String TASK = "Answer 'yes' if number is even otherwise answer 'no'.";
    private static final int BOUND_FOR_RANDOM = 100;

    public static String[][] getResult() {
        String[][] roundsData = new String[Engine.AMOUNT_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.AMOUNT_OF_ROUNDS) {
            int number = Utils.generateRandomNumber(BOUND_FOR_RANDOM);
            roundsData[i][0] = String.valueOf(number);

            boolean even = (number % 2 == 0);
            roundsData[i][1] = even ? "yes" : "no";

            ++i;

        }

        return roundsData;
    }

    public static void run() {
        Engine.run(getResult(), TASK);
    }
}
