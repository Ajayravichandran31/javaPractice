public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int originalNumber = 153;
        int temp = originalNumber;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = originalNumber;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            int powerResult = 1;
            for (int i = 0; i < digits; i++) {
                powerResult = powerResult * lastDigit;
            }

            sum = sum + powerResult;
            temp = temp / 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number.");
        }
    }
}
