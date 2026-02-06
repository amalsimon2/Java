package Number_problem;
import java.util.Scanner;
import java.util.HashSet;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1) System.out.println("Happy Number");
        else System.out.println("Not Happy Number");
    }
}
