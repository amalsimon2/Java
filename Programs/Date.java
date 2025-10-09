import java.util.*;
public class Date {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    scan.useDelimiter("[/\\n]");

    int a = scan.nextInt();
    int b= scan.nextInt();
    int c= scan.nextInt();

        if (a >=1 && a <=31 && b>=1 && b<=12 && c>=1900 && c<=2025 ){

                System.out.println("Valid Date");

        }
        else {
            System.out.println("InValid Date");
        }
        if(a >= 1 &&a<=31){
            System.out.println("Day is valid");
        }
        else {
            System.out.println("Day is not valid");
        }
        if(b >= 1 &&b <=12){
            System.out.println("Month is valid");
        }
        else{
            System.out.println("Month is not valid");
        }
        if ( c >= 1900 & c <=2025){
            System.out.println("Year is valid");
        }
        else {
            System.out.println("Year is not valid");
        }



}
}
