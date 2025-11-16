package strings;

import java.util.Scanner;

public class PrintCapitals {

    public static String printCapitals(String s){
        String t="";
        for (int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if (ch>='A' && ch<= 'Z'){
                t=t+ch;
            }
        } return t;
    }

    public static String printLower(String s){
        StringBuilder t= new StringBuilder();
        for (int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if (ch>='a' && ch<= 'z'){
                t.append(ch);
            }
        } return t.toString();
    }



    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.nextLine();
        System.out.println("All upperCase : "+printCapitals(str));
        System.out.println("All lowercase : "+printLower(str));
    }
}
