package importantQuestions;

import java.util.Scanner;

public class getSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        boolean res= isContain(s1,s2);
        System.out.println(res);

    }

    private static boolean isContain(String s1,String s2) {
        int i=0,j=0;
        String t="";

        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                t=t+s1.charAt(i);
                i++;
                j++;
            }
            else if(t.equals(s2)){
                return true;
            }
            else{
                i++;
                j=0;
                t="";
            }
        }
        System.out.println(t);
        return false;
    }
}
