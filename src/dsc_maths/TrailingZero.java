package dsc_maths;

import java.util.Scanner;

public class TrailingZero {
    // count zeroes in  last position of factorial of given number
    static int trailingZero(int n1){
        int powOf5=5, res=0;
        while(n1 >= powOf5){
            res=res+(n1/powOf5);
            powOf5*=5;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();

        System.out.println(trailingZero(n1));

    }
}
