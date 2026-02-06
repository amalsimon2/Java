package Number_problem;
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n;

        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        if (sum == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
