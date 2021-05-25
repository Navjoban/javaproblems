// check whether a number can be expressed as sum of two prime numbers
public class CheckPrimeNum {
    public static void main(String[] args) {

                int num = 34;
                for (int i=2;i<=num/2;i++){         //check from 2 --> number/2 to look for pairs, that will be i and num - i
                   if( CheckPrime(i)){
                       if(CheckPrime(num-i)){
                           System.out.println(i + " "+(num -i));
                       }
                   }
                }

}

public static boolean CheckPrime(int num){
        boolean isPrime = true;
        for (int i = 2;i<=num/2;i++){
            if(num%i==0){
                 isPrime = false;
                 break;
            }
        }
        return isPrime;
}
}
