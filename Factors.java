// Program to print all the factors of a given number
public class Factors {
    public static void main(String[] args) {

        int num = 30;
        for (int i =1;i<=num;i++){
            if(num%i==0)
                System.out.println(i + " ");
        }
    }
}
