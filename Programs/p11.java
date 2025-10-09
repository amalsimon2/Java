import java.util.*;
public class p11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s =i;s  <n;s++){
                System.out.print("  ");
            }
            for(int t =i;t>=0;t--){
                System.out.print(t+" ");
            }
            for(int u = 1; u<=i;u++){
                System.out.print(u+" ");
            }
            System.out.println();
        }
    }
}
