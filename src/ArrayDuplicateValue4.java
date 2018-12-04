import java.util.Scanner;
/*Write a Java program to find the duplicate
values of an array of integer values.*/
public class ArrayDuplicateValue4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements you want in array");
        int num = sc.nextInt();
        int c[] = new int[num];
        System.out.println("Enter all the Elements:");
        for (int i = 0; i < num; i++) {
            c[i] = sc.nextInt();
        }
        System.out.print("Array Elements\t:\t");

        for (int i = 0; i < c.length; i++) {

            System.out.print(c[i] + ",");

        } int d = 0;

        for (int i = 0; i<c.length;i++){
            for (int j = i+1;j<c.length;j++)
                if (c[i]==c[j]) {
                    d = c[i];
                    System.out.println(c[j
                            ]+ "is more then one time ");
                }
        }




    }


}
