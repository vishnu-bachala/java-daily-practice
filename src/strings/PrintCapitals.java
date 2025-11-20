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

    public static int vowels(String s){
        int count=0;
        s=s.toLowerCase();
        for (int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            System.out.println("index of "+ch+" => "+"aeiou".indexOf(ch));
            if ("aeiou".indexOf(ch) != -1){
               count +=1;
            }
        }
        return  count;
    }



    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.nextLine();

        // method calling
        System.out.println("All upperCase : "+printCapitals(str));
        System.out.println("<===============>");
        System.out.println("All lowercase : "+printLower(str));
        System.out.println("<===============>");
        System.out.println("Count of Vowels :"+ vowels(str));
    }
}
