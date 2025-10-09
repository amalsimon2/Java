import java.util.Scanner;

public class butterfly2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=(n*2-1);i++){
            int s=i>n ?(n*2)-i:i;
            for(int j = 1;j<=n*2;j++){
                if(j<=s||j>(n*2-s)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}


