public class chara{
    public static void main(String[] args){
        char input = 'A';
        if(input >= 'a' && input <= 'z'|| input >= 'A' && input <= 'Z'){
            System.out.println("Alphabets");
        } else if (input >= '0' && input <= '9') {
            System.out.println("Numbers");
        }  else{
            System.out.println("Special");
        }
    }
}
