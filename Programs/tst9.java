import java.util.Scanner;

public class tst9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many times : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i =1;i<=n;i++){
            System.out.println(a+" ");
            int f = a+b;
            a=b;
            b=f;


        }
    }
}
