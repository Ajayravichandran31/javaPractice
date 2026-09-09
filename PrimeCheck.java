public class PrimeCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 4, 17, 20, 1, -5};
        for (int n : testNumbers) {
            System.out.println("Is " + n + " prime? " + isPrime(n));
        }
    }
}
