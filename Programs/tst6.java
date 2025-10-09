import java.util.*;
public class tst6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int sum=0;
        int pro =1;
        for(int i =2;i<=n+1;i++){
            pro *=i;

            sum+=pro;
        }

        System.out.println(sum);
    }
}
