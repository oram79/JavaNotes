package Practice.Practice1;
import java.util.Scanner;

public class LabTasks4 {

    /// Question #4 ///
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int count = 0;
        int number;

        System.out.println("Enter Numbers (type -999 to stop the count):");

        while (true) {
            number = scanner.nextInt();
            if(number == -999) {
                break;
            }
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No Numbers Were Entered.");
        }

        scanner.close();

    }
}
