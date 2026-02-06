package Array_1d;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean printed = false;
            for (int k = 0; k < i; k++)
                if (a[i] == a[k]) printed = true;

            if (printed) continue;

            int count = 0;
            for (int j = 0; j < n; j++)
                if (a[i] == a[j]) count++;

            if (count > 1)
                System.out.print(a[i] + " ");
        }
    }
}
