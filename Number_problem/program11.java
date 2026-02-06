package Number_problem;
import java.util.Scanner;

public class program11 {
    static int reverse(int x) {
        int r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq1 = n * n;
        int sq2 = reverse(reverse(n) * reverse(n));

        if (sq1 == sq2) System.out.println("Adam Number");
        else System.out.println("Not Adam Number");
    }
}
