package Array_2d;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] A = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
}
