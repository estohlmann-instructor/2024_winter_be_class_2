import java.util.Scanner;

public class Class3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {

            int number1 = getNumberFromUser(scanner, "Enter your first number: ");
            int number2 = getNumberFromUser(scanner, "Enter your second number: ");
            String operation = getOperationFromUser(scanner);
            doMath(number1, number2, operation);

            if(!goAgain(scanner)){
                break;
            }
        }
    }

    private static int getNumberFromUser(Scanner scanner, String prompt){
        System.out.print(prompt);
        int ret = scanner.nextInt();
        scanner.nextLine();
        return ret;
    }

    private static String getOperationFromUser(Scanner scanner){
        System.out.print("Enter your operand(+,-,*,/,%): ");
        return scanner.nextLine();
    }

    private static boolean goAgain(Scanner scanner){
        System.out.print("\nContinue (y/n): ");
        String goAgain = scanner.nextLine();
        return goAgain.equalsIgnoreCase("y");
    }

    private static void doMath(int number1, int number2, String operation){
        double result;
        if(operation.equals("+")){
            result = addition(number1, number2);
        } else if(operation.equals("-")){
            result = subtraction(number1, number2);
        } else if(operation.equals("*")){
            result = multiplication(number1, number2);
        } else if(operation.equals("/")){
            result = division(number1, number2);
        } else {
            result = modulus(number1, number2);
        }
        System.out.println("\nThe answer to " + number1 + " " + operation + " " + number2 + " is " + result);
    }

    private static int addition(int number1, int number2){
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2){
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    private static double division(int number1, int number2){
        return (double)number1 / number2;
    }

    private static int modulus(int number1, int number2){
        return number1 % number2;
    }
}
