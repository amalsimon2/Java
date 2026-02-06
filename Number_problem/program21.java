package Number_problem;
import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(s.substring(0,3) + "-" +
                s.substring(3,6) + "-" +
                s.substring(6));
    }
}
