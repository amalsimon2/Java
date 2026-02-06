package String_Problems;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++)
            count++;

        System.out.println(count);
    }
}
