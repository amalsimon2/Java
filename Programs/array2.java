
public class array2 {
    public static void main(String[] args) {

        int arr[] = {1,  23, 62, 45, 22, 30, 65};
        System.out.println("Even: ");
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd: ");
        for (int i=0;i<arr.length;i++) {
            if (arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }
    }
}
