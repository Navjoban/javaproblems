//print sum of first n natural numbers
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to calculate the Sum of natural numbers");
        int n = sc.nextInt();
        System.out.println("Sum is :" + n/2*(n+1));                                 // general formula
        System.out.println("---------Using for loop -------------");
        int sum = 0;                                                    //using loop
        for (int i=1;i<=n;i++){
                sum = sum +i;
        }
        System.out.println("Sum is : "+sum);
    }
}
