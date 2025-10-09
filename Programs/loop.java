
import java.util.Scanner;
public class loop
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st value: ");
        int a = in.nextInt();
        int c=0;
        while(true)
        {
            System.out.println("Enter the choice: ");
            int n = in.nextInt();
            if (n == 6){
                System.out.println("Exiting");
                break;
            }
            System.out.println("Enter the 2nd Value: ");
            int b = in.nextInt();

            switch(n)
            {
                case 1:{
                    a+=b;
                    System.out.println("Addition: "+a);
                    break;
                }
                case 2:{
                    a-=b;
                    System.out.println("Subtraction: "+a);
                    break;
                }
                case 3:{
                    a*=b;
                    System.out.println("Multiplication: "+a);
                    break;
                }
                case 4:{
                    a/=b;
                    System.out.println("Division: "+a);
                    break;
                }
                case 5:{
                    a%=b;
                    System.out.println("Mod: "+a);
                    break;
                }
            }
        }
    }
}
