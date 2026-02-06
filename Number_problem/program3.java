package Number_problem;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }
}
