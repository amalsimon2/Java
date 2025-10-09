import java.util.*;
public class tst7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd =0;
        int even=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                odd+=i;
            }
            else {
                even+=i;
            }
        }
        System.out.println("Sum of Odd = "+odd);
        System.out.println("Sum of Even = "+even);
    }
}
