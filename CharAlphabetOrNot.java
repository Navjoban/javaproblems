// program to give output on whether a character is alphabet or not
import java.util.Scanner;

public class CharAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if((c>='a'&&c<='z') ||(c>='A'&&c<='Z')){
            System.out.println("Entered Char is an Alphabet");
        }
            else{
            System.out.println("Entered Char is not an Alphabet");
        }
    }
}
