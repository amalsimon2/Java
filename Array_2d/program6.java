package Array_2d;
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] A = new int[r][c];
        int zero = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
                if (A[i][j] == 0) zero++;
            }

        if (zero > (r * c) / 2)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not Sparse Matrix");
    }
}
