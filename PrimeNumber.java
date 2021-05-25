// To check if a number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 331;
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            }

        if (!flag) {
            System.out.println("Number " +num + " is prime");
        } else {
            System.out.println("Number " +num + " is not prime");
        }
    }
}





