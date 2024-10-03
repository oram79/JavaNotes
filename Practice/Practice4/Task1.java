package Practice.Practice4;

public class Task1 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        double average = sum / (double) arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

