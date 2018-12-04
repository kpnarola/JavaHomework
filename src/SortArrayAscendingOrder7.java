import java.util.Scanner;

public class SortArrayAscendingOrder7 {
    public static void main(String[] args) {
        int number, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element you want in array:");
        number = sc.nextInt();

        int a [] = new int[number];
        System.out.println("Enter all the Elements:");
        for (int i = 0; i < number;i++){
            a[i] = sc.nextInt();
        }for (int i = 0; i <number;i++){
            for (int j = i+1; j <number;j++){
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < number-1;i++){
            System.out.println(a[i]+",");
        }
        System.out.println(a[number-1]);
    }
}
