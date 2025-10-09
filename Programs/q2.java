import java.util.*;
public class q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String str  = sc.nextLine();
//        String str = "82345+-%*";
        int a = str.charAt(0)-'0';//8


        for(int i=1;i<=str.length()/2;i++)
        {
            int b = str.charAt(i)-'0';//2
            char c = str.charAt(str.length()/2 + i);
            //System.out.println(c);
            switch(c)
            {
                case '+':{
                    a = a+b;
                    break;
                }
                case '-':{
                    a=a-b;
                    break;
                }
                case '*':{
                    a=a*b;
                    break;
                }
                case '/':{
                    a=a/b;
                    break;
                }
                case '%':{
                    a=a%b;
                    break;
                }
                default:{
                    System.out.println("Error");
                    break;
                }
            }
        }
        System.out.println(a);
    }
}

