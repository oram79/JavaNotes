package Practice.Week1;

import java.util.Scanner;

public class LabTasks5 {

    /// Question #5 ///
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter The Second Number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;
        boolean vaildOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division By Zero Is Not Allowed");
                    vaildOperation = false;
                }
                break;
            default:
            System.out.println("Error: Invaild Operator");
            vaildOperation = false;
            break;
        }

        if (vaildOperation) {
            System.out.printf("Result: %.2f%n", result);
        }
        scanner.close();
    }
}
