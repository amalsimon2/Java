import java.util.*;
public class abc {
public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value: ");
    String i = sc.nextLine();

    String s = "";

    for (char ch : i.toCharArray()) {
        if (ch >= 'a' && ch <= 'z') {
            s += (char)(ch - ('a' - 'A'));
        } else if (ch >= 'A' && ch <= 'Z') {
            s += (char)(ch + ('a' - 'A'));
        } else {
            s += ch;
        }
    }

    System.out.println("The Output: " + s);
    sc.close();
}
}
