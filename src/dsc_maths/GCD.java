package dsc_maths;

import java.util.Scanner;

// euclidean method
public class GCD {
    static int gcd(int a, int b){
        int temp=0;
        while(b != 0){
            temp = b;
            b = a % b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        System.out.println(gcd(n1,n2));

    }
}
