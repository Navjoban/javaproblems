// To calculate the power of a given number
public class PowerofNumber_23 {
    public static void main(String[] args) {
        int base = 4;
        int exponent = 3;
        long result = 1;
        while(exponent!=0){
            result = result*base;
            --exponent;
        }
        System.out.println("Result is "+result);
        System.out.println("-------------------");
        //using math power function
        System.out.println(Math.pow(2,3));
    }
}
