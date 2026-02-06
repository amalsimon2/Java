package Number_problem;
import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0, temp = n;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == n) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
