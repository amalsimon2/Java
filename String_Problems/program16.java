package String_Problems;
import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String longest = "", current = "";

        for (char c : s.toCharArray()) {
            if (current.indexOf(c) != -1)
                current = current.substring(current.indexOf(c) + 1);
            current += c;

            if (current.length() > longest.length())
                longest = current;
        }

        System.out.println(longest + " (Length = " + longest.length() + ")");
    }
}
