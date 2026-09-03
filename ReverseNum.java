import java.util.Scanner;
class ReverseNum{
    static void reverse(int n){
        int rev=0;
        while(n<0){
            int k=n%10;
            rev=rev*10+k;
            n=n/10;
            System.out.println(rev);
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        
    }
}