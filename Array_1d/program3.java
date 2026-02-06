package Array_1d;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int key = sc.nextInt();

        for (int i = 0; i < n; i++)
            if (a[i] == key)
                found = true;

        if (found) System.out.println("Present");
        else System.out.println("Not Present");
    }
}
