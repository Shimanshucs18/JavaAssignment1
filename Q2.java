//package Source;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String str= "";
        Scanner datalein = new Scanner(System.in);
        String str1="";

        while (!"XDone".equals(str = datalein.nextLine())) {
            str1+=str+" ";


        }
        System.out.println(str1);
    }

}