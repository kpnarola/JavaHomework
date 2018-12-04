import java.util.Scanner;

public class FirstLastDigitTotal13 {
    public static void main(String[] args) {
        System.out.println("Please input Five digit Number:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a, b, c;
        a = b = c = 0;
        if (num < 99999) {
            c = num % 10;
            //System.out.println("Reverse number of your Input is:");
            while (num > 0) {
                a = num % 10;
                num = num / 10;
            }
        } else {
            System.out.println("Your input is not five digit number");
        }
        System.out.println("Total of First and Last Digit:"+(a+c));

    }
}
