public class DigitSum {
    public static int sumOfDigits(int num) {
        if (num < 0) {
            num = -num;
        }

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1234, 987, 0, -56};
        for (int n : testNumbers) {
            System.out.println("Sum of digits for " + n + ": " + sumOfDigits(n));
        }
    }
}
