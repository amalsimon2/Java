package Number_problem;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        do {
            count++;
            n /= 10;
        } while (n != 0);

        System.out.println(count);
    }
}
