package bit_manipulation;

import java.util.Scanner;

public class SetBits {
    // method 1 , tc=O(log n)
    static int positionOfRMSB(int n){
        int mask=1;
        int position=0;

        if(n==0) return -1;
        while( (n & mask)==0){
            mask = mask<<1;
            position ++;
        }
        return position+1;
    }

    // method 2 to find RMSB
    static int positionOfRMSB2(int n){
        return (int) (Math.log((n^(n&n-1)))/Math.log(2))+1;
    }

    // Trailing zeroes = Count right most Zeroes
    static int trailingZeroes(int n){

        if(n==0) return 31;

        // it prints no.of zeroes after the first 1 bit from RHS
        return (int) ((Math.log((n&n-1)^n)) / Math.log(2));
    }

    // COUNT NO.OF 1'S IN GIVEN NUM BINARY REPRESENTATION
    static int countOnes(int n){
        int count=0;
        while(n!=0) {
            n = n & n - 1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = countOnes(n);
        System.out.println(i);

    }
}
