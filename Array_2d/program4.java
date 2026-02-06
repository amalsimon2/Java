package Array_2d;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        boolean equal = true;

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (A[i][j] != B[i][j])
                    equal = false;

        if (equal) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}
