package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Your choice: " + input);

        if (input == EXIT) {
            System.out.println("Goodbye!");
            return;
        }

        switch (input) {
            case GREET:
                Engine.playGame(new String[0][0], "");
                break;
            case EVEN:
                Even.playGame();
                break;
            case CALC:
                Calculator.playGame();
                break;
            case GCD:
                Gcd.playGame();
                break;
            case PROGRESSION:
                Progression.playGame();
                break;
            case PRIME:
                Prime.playGame();
                break;
            default:
                System.out.println("There's no such game!");
                break;
        }
    }
}
