package dsc_maths;

import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b){
        int temp=0;
        while(b != 0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        int product=a*b;
        int hcf=gcd(a,b);

        return product/hcf;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();

        System.out.println(lcm(n1,n2));

    }
}
