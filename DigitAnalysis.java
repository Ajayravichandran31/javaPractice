public class DigitAnalysis {
    public static void analyzeDigits(int num) {
        System.out.println("Analyzing number: " + num);
        
        if (num == 0) {
            System.out.println("Even digits count: 1");
            System.out.println("Odd digits count: 0");
            System.out.println("------------------------");
            return;
        }

        if (num < 0) {
            num = -num;
        }

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            num = num / 10;
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        int[] testNumbers = {123456, 7891, 0, -2468};
        for (int n : testNumbers) {
            analyzeDigits(n);
        }
    }
}
