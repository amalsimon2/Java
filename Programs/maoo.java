import java.util.Scanner;
public class maoo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int s =sc.nextInt();
        int arr[] = new int[s];
        int sum=0;
        for(int i =0;i<s;i++){

            int a = sc.nextInt();
            arr[i]=a;
            sum++;

        }

        System.out.println(sum);
    }
}