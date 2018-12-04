import java.util.Arrays;

/*1. Write a Java program to sort a numeric array
and a string array.*/

public class ArraySortingNumberString1 {

    public static void main(String[] args) {
        String[] names = new String[]{"Kiran", "Toran","Prakruti","Jigi","Usha"};

        Arrays.sort(names);
        System.out.println("\n");

        for (int i = 0;i<names.length;i++)
            System.out.println(names[i]+ ",");

        System.out.println("\n");

        int[] a = {10,20,30,40,50,33,86};//sort numeric array


        Arrays.sort(a);

        for (int i = 0; i < a.length;i++)
        System.out.print(a[i]+" , ");





    }
}
