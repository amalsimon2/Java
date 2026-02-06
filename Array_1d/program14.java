package Array_1d;
import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int rot = sc.nextInt(); // rotation count
        String dir = sc.next(); // L or R

        rot = rot % n;

        if (dir.equalsIgnoreCase("L")) {
            for (int i = rot; i < n; i++)
                System.out.print(a[i] + " ");
            for (int i = 0; i < rot; i++)
                System.out.print(a[i] + " ");
        } else {
            for (int i = n - rot; i < n; i++)
                System.out.print(a[i] + " ");
            for (int i = 0; i < n - rot; i++)
                System.out.print(a[i] + " ");
        }
    }
}
