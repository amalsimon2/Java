package Conditional_Statements;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        String[] p = date.split("/");
        int d = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int y = Integer.parseInt(p[2]);

        int max;
        boolean valid = true;

        if (m < 1 || m > 12) valid = false;
        else {
            if (m == 2) {
                if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
                    max = 29;
                else
                    max = 28;
            } else if (m == 4 || m == 6 || m == 9 || m == 11)
                max = 30;
            else
                max = 31;

            if (d < 1 || d > max) valid = false;
        }

        if (valid) System.out.println("Valid Date");
        else System.out.println("Invalid Date");
    }
}
