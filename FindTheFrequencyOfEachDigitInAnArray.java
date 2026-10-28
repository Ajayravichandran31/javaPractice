import java.util.Scanner;

public class FindTheFrequencyOfEachDigitInAnArray {

    // Separate function to calculate and print frequencies
    public static void findDigitFrequency(int[] arr) {
        // Since digits can only be 0-9, an array of size 10 acts as our counter
        int[] freq = new int[10];

        // 1. Count the occurrences of each digit
        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i];
            if (digit >= 0 && digit <= 9) {
                freq[digit]++; 
            }
        }

        // 2. Print the results in the "Digit-Count" format
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "-" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Get the digits from the user
        System.out.println("Enter the digits (0-9) of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nOutput:");
        // Call the separate logic function
        findDigitFrequency(arr);

        scanner.close();
    }
}
