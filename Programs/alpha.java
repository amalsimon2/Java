import java.util.*;

public class alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String str = sc.nextLine();
        System.out.println("Output: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                ch = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {

                ch = (char) (ch - 32);
            }

            System.out.println(ch);
        }
    }
}
