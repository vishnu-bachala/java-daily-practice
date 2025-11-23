package basic;

import java.util.Scanner;

public class Factors {
    public static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0) System.out.println(i);
        }
    }
    public static int countFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count ++;
        }
        return count;
    }
    public static void commonMultipliers(int n, int m){
        int min=n<m ? n : m;
        for(int i=1;i<=min;i++){
            if(n%i==0 && m%i==0){
                System.out.println(i);
            }
        }
    }

    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a value to find factors of :");
        int n= sc.nextInt();
        int m= sc.nextInt();

//        System.out.println(countFactors(n));
        commonMultipliers(n, m);
    }
}
