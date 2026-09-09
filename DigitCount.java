public class DigitCount {
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num = -num; 
        }

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] testNumbers = {12345, -456, 0, 7};
        for (int n : testNumbers) {
            System.out.println("Digits in " + n + ": " + countDigits(n));
        }
    }
}