// count the number of digits in a given integer
import java.util.Scanner;

public class CountNumofDigitsInInteger_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int count =0;
        while (Number !=0){
            Number = Number/10;
            ++count;
        }
        System.out.println("Number of digits: "+count);

    }
}
