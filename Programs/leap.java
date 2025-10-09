
import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }
}