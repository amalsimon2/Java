package Number_problem;
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n, sum = 0;

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        if (sum == n) System.out.println("Kaprekar Number");
        else System.out.println("Not Kaprekar Number");
    }
}
