import java.util.Scanner;

public class ArraySpecificValue2 {
    /*Write a Java program to test if an array contains
a specific value.*/
    public static void main(String[] args) {
boolean present =  false;
int index= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int value =sc.nextInt();
        int[] a = {10,30,50,60,70,90};
        for (int i = 0; i<a.length;i++){
            if (a[i]== value){
                present = true;
                index = i;
            }
        }if (present == true){
            System.out.println("Value found at the index"+index+"is in the arrey list");
        }else{
            System.out.println("Value is not present in the arrey list");
        }

    }





}
