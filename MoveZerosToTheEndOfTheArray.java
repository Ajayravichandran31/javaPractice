import java.util.Scanner;

public class MoveZerosToTheEndOfTheArray {

    // Separate function handling the core logic
    public static void moveZeroes(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Optimized: Only swap if pointers are at different positions
                if (i != index) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // 2. Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Call the logic function
        moveZeroes(arr);

        // 4. Print the result using a traditional loop
        System.out.print("Result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close(); // Clean up resource
    }
}
