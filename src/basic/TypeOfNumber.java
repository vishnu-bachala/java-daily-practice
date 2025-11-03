package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeOfNumber {
    public static void main(String [] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value : ");
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) System.out.println("is Positive");
        else if (number < 0) System.out.println("is Negative");
        else System.out.println("is Zero");
    }
}
