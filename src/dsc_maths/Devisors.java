package dsc_maths;

import java.util.Scanner;

public class Devisors {
    static void part1Devisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }

    static void part2Devisors(int n){
        for(int i=(int)Math.sqrt(n);i>0;i--){
            if(n%i == 0 && i !=n/i){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        // calling functions
        part1Devisors(n);
        part2Devisors(n);
    }
}
