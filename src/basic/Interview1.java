package basic;

import java.util.Scanner;

public class Interview1 {

    public static void binaryNumbers(int n) {
        if (n == 0) System.out.println("0");
        for (int i = 1; i <= n; i++) {
            String binary = "";
            int num =i;
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary;
                num = num / 2;
            }
            System.out.print(binary+" ");
        }
    }

    public static void bin(int n){
        for(int i=1;i<=n;i++){
            String res=Integer.toOctalString(i);
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        binaryNumbers(n);
    }
}
