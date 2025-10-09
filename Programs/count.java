import java.util.Scanner;




public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s =n;
        int count = 0;
        int i =0;
        System.out.print("Reversed number: ");
        while(n>0){
            System.out.print(i=n%10);
            count =count*10+i;
            n=n/10;


        }
        System.out.println();
        System.out.print("The greater number : ");
        if(s<count){
            System.out.print(count);
        }
        else {
            System.out.print(s);
        }


    }
}
