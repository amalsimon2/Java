package String_Problems;
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        boolean pangram = true;
        for (char c = 'a'; c <= 'z'; c++)
            if (!s.contains(String.valueOf(c)))
                pangram = false;

        if (pangram) System.out.println("Pangram");
        else System.out.println("Not Pangram");
    }
}
