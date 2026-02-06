package String_Problems;
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++)
            if (result.indexOf(s.charAt(i)) == -1)
                result += s.charAt(i);

        System.out.println(result);
    }
}
