import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        greeting();
        int roll1 = rollDice();
        int roll2 = rollDice();
        diceNumber(roll1, roll2);
    }
    private static void greeting() {
        System.out.print("Dice Roller");
        System.out.println();
    }

    private static int rollDice() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(6)+1;
    }

    private static void diceNumber(int roll1, int roll2) {
        System.out.println("Dice 1: " + roll1);
        System.out.println("Dice 2: " + roll2);
    }

}
