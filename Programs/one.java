import java.util.*;
public class one {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i=0;i<str.length();i++){

            int ch = str.charAt(i);
            
            if(ch =='z' && ch == 'Z'){
                System.out.println('a');
            }
            else {
                System.out.println((char) (ch + 1));
            }
        }
    }
}
