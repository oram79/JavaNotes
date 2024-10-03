package Practice.Practice4;

public class Task2 {
    public static void main(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        System.out.println("Incremented Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

