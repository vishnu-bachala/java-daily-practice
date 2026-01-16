package bit_manipulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=10;
        int b=12;
        long c= (long) 2.305843009213694E18-1;
        System.out.println(Math.pow(2,61));
        System.out.println(Long.toBinaryString(c));

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("and operator : "+ (a & b));
        System.out.println("or operator : "+ (a | b));
        System.out.println("xor operator : "+ (a ^ b));
        System.out.println(">> operator a : "+ (a >> 1));
        System.out.println("<< operator a : "+ (a << 1));
        System.out.println(">>> operator : "+ (-10 >>> 1));
        System.out.println("~ operator a: " +(~-123));
        System.out.println(-(-123+1));

        System.out.println(Integer.toBinaryString(2147483643));
        System.out.println(Integer.toOctalString(2147483643));
        System.out.println(Integer.toHexString(2147483643));
        System.out.println(Integer.toBinaryString((int)Math.pow(2,31)));


    }
}
