import java.util.Scanner;

public class ReverceString18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String");
        String str = sc.nextLine();
        char [] array = str.toCharArray();
for (int i = str.length()-1;i>=0;i--){
    System.out.println(array[i]);
}
    }
}
