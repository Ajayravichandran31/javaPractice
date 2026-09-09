public class DigitalRoot {
    public static int getDigitalRoot(int num) {
        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            return 0;
        }

        int root = num % 9;
        return (root == 0) ? 9 : root;
    }

    public static void main(String[] args) {
        int[] testNumbers = {38, 987, 0, -56, 9999};
        for (int n : testNumbers) {
            System.out.println("Digital root for " + n + ": " + getDigitalRoot(n));
        }
    }
}
