import java.util.Scanner;

public class ar1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times: ");
        int s =sc.nextInt();
        int arr[] = new int[s];

        for(int i =0;i<s;i++){
            System.out.print("Enter a value: ");
            int a = sc.nextInt();
            arr[i]=a;

        }
        System.out.print("Array: { ");
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");



    }
}
