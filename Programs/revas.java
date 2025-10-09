import java.util.*;
public class revas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        while (m > 0) {
            count++;
            m /= 10;
        }
        int half =count/2;
        int r =1;
        for (int i = 0; i < half; i++) {
            r *= 10;
        }
        int last = n% r;
        int first = n / r;
        int rLast = 0;
        while (last > 0) {
            rLast = rLast * 10 + (last%10);
            last /= 10;
        }
        int result=first*r+rLast;
        System.out.println("Result: "+result);
    }
}