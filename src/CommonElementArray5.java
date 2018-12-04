import java.util.HashSet;

public class CommonElementArray5 {

    /*Write a Java program to find the common
elements between two arrays (string values).*/
    public static void main(String[] args) {

        String [] s1 ={"Kiran","Dharmi","khushi","Sejal","Bansu","Dharmi"};
        String[] s2 = {"Kiran","Neeta","Nisha","Dharmi","Kiram","Dharmi"};
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i <s1.length;i++){
            for (int j = 0; j < s2.length;j++){
                if (s1[i].equals(s2[j])){
                    set.add(s1[i]);
                }
            }
        }

        System.out.println(set);

    }




}
