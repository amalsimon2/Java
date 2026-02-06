package Array_2d;
import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int sum = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
                if (i == j) sum += A[i][j];
            }

        System.out.println(sum);
    }
}
