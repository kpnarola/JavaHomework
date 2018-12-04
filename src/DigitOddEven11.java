import java.util.Scanner;

public class DigitOddEven11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Five digit number:");
        int a = sc.nextInt();
        if (a<99999){
            int sum = 0;
            int sum1 = 0, even = 0, odd = 0;
            while (a!=0){
                int lastdigit = a%10;

                if (lastdigit%2==0){
                   sum = sum + lastdigit;
                   even++;
                }else {
                    sum1=sum1+lastdigit;
                    odd++;
                }
                a = a/10;
            }
            System.out.println("Number of Even digits are "+even+" and Sum of Even Digits : " + sum);
            System.out.println("Number of odd digits are "+odd+" and Sum of Odd Digits : "+ sum1);
        }else {
            System.out.println("\nYour input is not five digit number.");

        }
    }

}
