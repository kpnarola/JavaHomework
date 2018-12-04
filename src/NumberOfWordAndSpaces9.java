import java.util.Scanner;
/*WAP to enter any String and count how many
total number of words and total number of
spaces in that sentence*/

public class NumberOfWordAndSpaces9 {

    public static void main(String[] args) {
                String str;
        int space=0;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == ' '){
                space++;
            }
        }
        System.out.println("Number of word are:"+ (space+1));
        System.out.println("Number of space are:"+space);
    }
}
