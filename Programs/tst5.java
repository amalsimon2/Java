import java.util.*;
public class tst5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro =1;
        for(int i =1;i<=n;i++){
            pro *=i;

        }
        System.out.println(pro);
    }
}
