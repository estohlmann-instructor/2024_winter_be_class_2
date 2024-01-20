import java.util.Scanner;

public class Class2 {
    public static void main(String... args){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your first number: ");
            int number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your second number: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your operand(+,-,*,/,%): ");
            String operand = scanner.nextLine();

            double result;
            switch (operand) {
                case "%":
                    result = number1 % number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = (double) number1 / number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                default:
                    result = number1 + number2;
            }

            System.out.println("\nThe answer to " + number1 + " " + operand + " " + number2 + " is " + result);
            System.out.print("\nContinue (y/n): ");
            String goAgain = scanner.nextLine();
            if(!goAgain.equalsIgnoreCase("y")){
                break;
            }
            System.out.println();
        }

    }
}
