public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = (reversedNum * 10) + remainder;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, -121, 12345, 12321, 0};
        for (int n : testNumbers) {
            System.out.println("Is " + n + " a palindrome? " + isPalindrome(n));
        }
    }
}
