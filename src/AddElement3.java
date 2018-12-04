import sun.security.provider.Sun;

import java.util.Scanner;
/*3. Write a Java program to insert an element
(specific position) into an array.*/
public class AddElement3 {
    public static void main(String[] args) {

        int [] a = {10,20,30,40,50};
        int pos = 3;
        int element = 100; // wanted to enter 100 in 3rd position
        for (int i =a.length-1;i>pos-1;i--){
            a[i]= a[i-1];
        }
        a[pos-1]= element;
        for (int i = 0; i <a.length;i++){
            System.out.println(a[i]+"");
        }
    }
}
