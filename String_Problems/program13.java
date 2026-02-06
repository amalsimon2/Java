package String_Problems;
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();

        if (s.contains(sub))
            System.out.println("Substring Found");
        else
            System.out.println("Substring Not Found");
    }
}
