package Conditional_Statements;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        String[] t = time.split(":");
        int h = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);

        if (h >= 0 && h <= 23 && min >= 0 && min <= 59)
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");
    }
}
