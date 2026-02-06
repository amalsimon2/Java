package Array_2d;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double det = a * d - b * c;

        if (det == 0) {
            System.out.println("Inverse not possible");
            return;
        }

        System.out.println((d / det) + " " + (-b / det));
        System.out.println((-c / det) + " " + (a / det));
    }
}
