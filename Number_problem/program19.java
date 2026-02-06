package Number_problem;
import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sum += Math.pow(d, i + 1);
        }

        if (sum == Integer.parseInt(s))
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium Number");
    }
}
