package hexlet.code;
import java.util.Random;

public class Utils {
    public static int getRandomNumber(int upperBound) {
        Random r = new Random();
        return r.nextInt(upperBound);
    }
}
