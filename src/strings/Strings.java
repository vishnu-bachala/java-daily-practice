package strings;

import java.util.Scanner;

public class Strings {
    public static String reverse(String s){
        String str="";
        int len =s.length();
       for(int i=len-1;i>=0;i--){
           str = str + s.charAt(i);
       }
       return str;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.nextLine();

        System.out.println(reverse(str));

    }
}
