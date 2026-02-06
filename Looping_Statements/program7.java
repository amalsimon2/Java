package Looping_Statements;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("Sum of Even = " + evenSum + ", Sum of Odd = " + oddSum);
    }
}
