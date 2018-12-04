import java.util.Scanner;

public class CountAinString8 {

    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                total++;
            }

        }
        System.out.println("Total number of a =" + total);


    }
}
