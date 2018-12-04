public class MultiplicationTableDoWhile17 {
    public static void main(String[] args) {


            int a = 1;
            int b = 1;
            int c = 3;
            do {
                do {
                    System.out.print(b * a + " ");
                    b++;
                } while (b <= c);
                a++;
                b = 1;
                System.out.println();

            } while (a <= c);

        }
    }

