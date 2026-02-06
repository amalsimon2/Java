package Number_problem;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), odd = 0, even = 0;

        while (n > 0) {
            if ((n % 10) % 2 == 0) even++;
            else odd++;
            n /= 10;
        }

        System.out.println("Odd = " + odd + ", Even = " + even);
    }
}
