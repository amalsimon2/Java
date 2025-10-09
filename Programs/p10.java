import java.util.*;
public class p10 {
    public static void main(String[] args) {
        int n=18;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                System.out.print(((j+i)%n+1)+" ");

            }
            System.out.println();
        }
    }
}
