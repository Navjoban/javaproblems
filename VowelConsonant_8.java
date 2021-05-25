// Program to output whether a given Alphabet is a vowel or a consonant
import java.util.Scanner;

public class VowelConsonant_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        String Alphabet = sc.next();
        if(Alphabet.equals("a")|| Alphabet.equals("A")|| Alphabet.equals("e")|| Alphabet.equals("E")|| Alphabet.equals("i")||Alphabet.equals("I")
                ||Alphabet.equals("o")|| Alphabet.equals("O")||Alphabet.equals("u")||Alphabet.equals("U")) {
            System.out.println("Alphabet is a Vowel");
        }
            else{
                System.out.println("Alphabet is a Consonant");
            }
        }

    }

