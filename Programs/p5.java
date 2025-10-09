import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(((i + j) % n+1 ) + " ");
            }
            System.out.println();
        }
    }
}