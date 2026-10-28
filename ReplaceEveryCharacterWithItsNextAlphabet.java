
import java.util.Scanner;

public class ReplaceEveryCharacterWithItsNextAlphabet {

    static String shiftLetters(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') {
                    ch = 'A';
                } else {
                    ch = (char)(ch + 1);
                }
            }
            else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'z') {
                    ch = 'a';
                } else {
                    ch = (char)(ch + 1);
                }
            }

            result = result + ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(shiftLetters(str));

        sc.close();
    }
}
