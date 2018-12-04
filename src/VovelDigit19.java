import java.util.Scanner;

public class VovelDigit19 {
    /*Write a program called CheckVowelsDigits,
which prompts the user for a String, counts the
number of vowels (a, e, i, o, u, A, E, I, O, U) and
digits (0-9) contained in the string, and prints the
counts and the percentages (with 2 decimal
digits). For example,
Enter a String: testing12345

Number of vowels: 2 (16.67%)
Number of digits: 5 (41.67%)*/

    public static void main(String[] args) {
        int total = 0;
                float totalchar=0;
                        float totalvowels=0;
                        float totaldigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String");
        String str = sc .nextLine();
        for (int i = 0; i <str.length();i++){
            char ch = str.charAt(i);//for counting character
            totalchar ++ ;
            if (ch == 'a'|| ch == 'A'||ch == 'e'||ch=='E'||ch == 'i'|| ch=='I'||ch=='o'||ch=='O'||ch == 'u'||ch=='U'){
                totalvowels++;
            }
        }for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '0'||ch == '1'||ch == '2'||ch == '3'||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch == '9'){
                totaldigit++;
            }
        }
        float percentageVowel=(totalvowels*100/totalchar);
        float percentageDigit = (totaldigit*100/totalchar);
        System.out.println("Total characters in String:"+totalchar);
        System.out.println("Total vowel in the String :"+totalvowels);
        System.out.println("Total Digit in the String:"+totaldigit);
        System.out.println("Total Percentages Vowel:"+percentageVowel+"%");
        System.out.println("Total percentages Digit:"+ percentageDigit+"%");
    }

}
