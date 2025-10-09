import java.util.*;
public class q1 {
    public static void main(String[] args){
        //input 82345+-%/
        //output 15
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        String str = in.nextLine();
        int sum = 0;
        for(int i=0;i<str.length()/2+1;i++)
        {
            System.out.println(str.charAt(i));
        }
        for(int i=(str.length()/2) +1 ;i<str.length();i++)
        {

            switch(str.charAt(i))
            {
                case '+':{
                    System.out.println("Add");
                    break;
                }
                case '-':{
                    System.out.println("Sub");
                    break;
                }
                case '*':{
                    System.out.println("MUL");
                    break;
                }
                case '/':{
                    System.out.println("Div");
                    break;
                }
                case '%':{
                    System.out.println("Mod");
                    break;
                }
            }
        }
    }
}
