import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int k =1;k<=i;k++){
                if(k ==1||k==i||i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
