package String_Problems;
import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int a = 0, n = 0, sp = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) a++;
            else if (Character.isDigit(c)) n++;
            else sp++;
        }

        System.out.println("Alphabets:" + a + ", Numbers:" + n + ", Specials:" + sp);
    }
}
