import java.sql.Array;
import java.util.Arrays;

public class ArrayEquality6 {
    /*6. Write a Java program to test the equality of two
arrays.*/

    public static void main(String[] args) {
        Integer array1[] = {1, 2, 3, 4, 5};
        Integer array2[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.equals(array1, array2));

        Integer array3[] = {1, 2, 3, 4, 5};
        Integer array4[] = {1, 6, 3, 4, 5};

        System.out.println(Arrays.equals(array3, array4));
    }
}