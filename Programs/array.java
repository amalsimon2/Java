
public class array {
    public static void main (String[] args) {

        int arr[] = {1,23,62,45,22,30,65};

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] % 2 ==0) {
                System.out.println("Even: "+arr[i]);

            }
            else{
                System.out.println("ODD: "+arr[i]);

            }
        }
    }
}


