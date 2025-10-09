import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        s.nextLine();

        while (true) {
            System.out.println("Type + for add, - for sub, * for mul, / for div, % for mod, or q to quit:");
            String n = s.nextLine();

            if (n.equalsIgnoreCase("q")) {
                System.out.println("Final Result: " + a);

                break;
            }

            System.out.print("Enter the next number: ");
            int b = s.nextInt();
            s.nextLine();

            switch (n) {
                case "+":
                    a = a + b;
                    System.out.println("Result: " + a);
                    break;
                case "-":
                    a = a - b;
                    System.out.println("Result: " + a);
                    break;
                case "*":
                    a = a * b;
                    System.out.println("Result: " + a);
                    break;
                case "/":
                    if (b != 0) {
                        a = a / b;
                        System.out.println("Result: " + a);
                    } else {
                        System.out.println("ERROR: Division by zero!");
                    }
                    break;
                case "%":
                    if (b != 0) {
                        a = a % b;
                        System.out.println("Result: " + a);
                    } else {
                        System.out.println("ERROR: Modulus by zero!");
                    }
                    break;
                default:
                    System.out.println("ERROR: Invalid operator");
            }
        }

        s.close();
    }
}
