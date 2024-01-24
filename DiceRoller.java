import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        greeting();

        while(true) {
            int roll1 = rollDice();
            int roll2 = rollDice();
            printDice(roll1, roll2);
            total(roll1 + roll2);
            if(!goAgain()) {
                break;
            }
        }
    }
    private static void greeting() {
        System.out.println("Dice Roller");
        System.out.println();
    }

    private static int rollDice() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(6)+1;
    }

    private static void printDice(int roll1, int roll2) {
        System.out.println("Dice 1: " + roll1);
        System.out.println("Dice 2: " + roll2);
    }

    private static void total(int total){
        System.out.println("Total: " + total);
        if(total == 12){
            System.out.println("Boxcars!");
        } else if(total == 2){
            System.out.println("Snake eyes!");
        }
    }

    private static boolean goAgain() {
        System.out.print("Continue? (y/n): ");
        Scanner response = new Scanner(System.in);
         String result = response.nextLine();
        return result.equalsIgnoreCase("y");
    }


}
