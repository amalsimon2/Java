import java.util.Scanner;
public class p6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int s = 0; s <(n-i); s++){ // for the spaces
                System.out.print("_ ");   //for spacing
            }
            for(int j = 0;j<i;j++){
                System.out.print("* "); //the stars
            }
            System.out.println();
        }
    }
}
