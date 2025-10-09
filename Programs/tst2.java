import java.util.*;
public class tst2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Odd: ");
        for(int i=1;i<n;i++){
            if(i%2!=0){

                System.out.println(i);
            }
        }
        System.out.println("Even: ");
        for(int i=1;i<n;i++){
            if(i%2==0){

                System.out.println(i);
            }
        }
    }
}
