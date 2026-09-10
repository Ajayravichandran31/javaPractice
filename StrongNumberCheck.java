public class StrongNumberCheck {
    public static void main(String[] args) {
        int originalNumber = 145; 
        int temp = originalNumber;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10; 
            
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            
            sum = sum + factorial; 
            temp = temp / 10;     
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }
    }
}
