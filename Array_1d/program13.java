package Array_1d;
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Even: ");
        for (int x : a)
            if (x % 2 == 0)
                System.out.print(x + " ");

        System.out.print(", Odd: ");
        for (int x : a)
            if (x % 2 != 0)
                System.out.print(x + " ");
    }
}
