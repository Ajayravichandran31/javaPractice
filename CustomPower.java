public class CustomPower {
    public static void main(String[] args) {
        double base = 2.0;
        int exponent = -3;
        
        double result = 1.0;
        int absoluteExponent = exponent < 0 ? -exponent : exponent;

        for (int i = 0; i < absoluteExponent; i++) {
            result = result * base;
        }

        if (exponent < 0) {
            result = 1.0 / result;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
