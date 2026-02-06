package Number_problem;
import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean e = false, o = false;

        System.out.print("Even: ");
        for (char c : s.toCharArray())
            if ((c - '0') % 2 == 0) {
                System.out.print(c + " ");
                e = true;
            }
        if (!e) System.out.print("None");

        System.out.print(", Odd: ");
        for (char c : s.toCharArray())
            if ((c - '0') % 2 != 0) {
                System.out.print(c + " ");
                o = true;
            }
        if (!o) System.out.print("None");
    }
}
