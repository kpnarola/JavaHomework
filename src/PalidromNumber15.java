import java.util.Scanner;
/* WAP to input any number and check if it is
Palindrome or not*/
public class PalidromNumber15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input any number");

        int num = sc.nextInt();
        int temp = num;
        int a, b, c;
        a = b = c = 0;
        while (num != 0)
        {
            a = num % 10;
        b = (b * 10) + a;
        num = num / 10;
    }
    if (temp==b){
        System.out.println(temp+"is palindrome number");
    }else {
        System.out.println(temp+"is not palindrome ");
    }




    }
}
