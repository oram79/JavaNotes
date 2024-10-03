package Practice.Practice1;
import java.util.Scanner;

public class LabTasks1 {
    
    /// Question #1 ///

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print( "Enter A One Digit Number: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
            int number = Character.getNumericValue(input.charAt(0));
            
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid number!");
                    break;
            }
        } else {
            System.out.println("(ERROR) Number Must Be Single Digit Only!");
        }
        scanner.close();
    }
}
