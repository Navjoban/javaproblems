// To input an integer from a user and tell its palindrome or not
import java.util.Scanner;
public class Palindrome_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        CheckPalindrome(num);
    }

    public static void CheckPalindrome(int num){
        int rev = 0;
        int tempNum = num;
      while(tempNum!=0) {
          int n = tempNum % 10;
          rev = rev * 10 + n;
          tempNum = tempNum / 10;
      }
        System.out.println(rev);
        if (num == rev){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is NOT a Palindrome");
        }
    }
}
