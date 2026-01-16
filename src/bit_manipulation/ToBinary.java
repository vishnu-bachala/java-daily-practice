package bit_manipulation;

import java.util.Scanner;

public class ToBinary {
    // converting form decimal to binary
    static String toBinary(int n){
        String binary="";

        while(n>0){
            binary=n%2 + binary;
            n=n/2;
        }
        return binary;
    }

    // converting from decimal to octal
    static String toOctal(int n){
        String octal="";
        while(n>0){
            octal = n%8+octal;
            n=n/8;
        }
        return octal;
    }

    // converting binary to decimal
    static int toDecimal(String s){
        int result=0;
        int powOf2=1;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') {
                result = result + powOf2;
            }
            powOf2 *=2;
        }
        return result;
    }

    // find the position of right most set bit 1101=> 1 st positon
    // 1010&1001=1000, 1010 ^ 1000=0010
    static int positionRMSB(int n){
        if(n==0 ) return -1;
        return (int) (Math.log((n ^ (n & n-1)))/Math.log(2))+1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
//        String s = scanner.next();

        // method calling
        /*String binary = toOctal(n);
        System.out.println(binary);*/

        System.out.println(positionRMSB(n));
    }
}
