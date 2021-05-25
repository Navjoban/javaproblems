// Factorial of a number using non recursive method
public class FactorialofNumber {
    public static void main(String[] args) {

        getFact(4);

    }
    public static void getFact(int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial :"+fact);
    }
}