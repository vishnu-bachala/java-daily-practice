package strings;

import java.util.Arrays;

public class ReadString {
    public static void  main(String [] args){
        String name="SoftwareS";

        for(char c : name.toCharArray() ){
            System.out.print(c+"   ");
        }
        System.out.println();
        for (int i=1; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        for(char c : name.toCharArray() ){
            System.out.print(c+"   ");
        }

    }
}
