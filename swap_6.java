// Program to swap two numbers
public class swap_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(" Before swapping ");
        System.out.println("value of a:" +a);
        System.out.println("value of b:" +b);

        System.out.println("After Swapping");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("value of a:" +a);
        System.out.println("value of b:" +b);

    }
}
