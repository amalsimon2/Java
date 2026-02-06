package Number_problem;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            System.out.print((n % 10) + " ");
            n /= 10;
        }
    }
}
