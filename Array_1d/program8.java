package Array_1d;
import java.util.Scanner;

public class program8 {

    static void printArray(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        printArray(a);
    }
}
