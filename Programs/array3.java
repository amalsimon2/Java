import java.util.Scanner;
public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i <size; i++) {
                System.out.println(arr[i]);
        }
    }
}
