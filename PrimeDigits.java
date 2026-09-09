public class PrimeDigits {
    public static void extractPrimeDigits(int num) {
        System.out.println("Analyzing number: " + num);

        if (num < 0) {
            num = -num;
        }

        int primeCount = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.println("Found prime digit: " + digit);
                primeCount++;
            }

            num = num / 10;
        }

        System.out.println("Total prime digits count: " + primeCount);
        
    }

    public static void main(String[] args) {
        int[] testNumbers = {234567, 1089, 73, -52};
        for (int n : testNumbers) {
            extractPrimeDigits(n);
        }
    }
}
