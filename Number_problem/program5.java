package Number_problem;
import java.util.Scanner;

public class program5 {
    static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n;

        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }

        System.out.println(sum);
    }
}
