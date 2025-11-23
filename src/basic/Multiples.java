package basic;

import java.util.Scanner;

public class Multiples {
    public static void multiples(int n, int x){
        if(n>x) System.out.println("no any multiples");

        for(int i=1;i*n<=x;i++){
            System.out.println(i*n);
        }
    }
    public static void multiples2(int n, int x){
        if(n>x) System.out.println("no any multiples");

        for(int i=1;i<=x;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
    public static void multiples3(int n, int x){
        if(n>x) System.out.println("no any multiples");

        for(int i=n;i<=x;i=i+n){
            System.out.println(i);
        }
    }

    public static void commonMultiples(int n, int a, int b){
        if(n>a) System.out.println("no any multiples");

        for(int i=1;i<=n;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
            }
        }
    }
    public static void printN_Common_Multiples(int n, int a, int b){

        int count=0;
        for(int i=1;count<n;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                count++;
            }
        }
    }
    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        System.out.println("Enter a number1 get muls  :");
        int a=sc.nextInt();

        System.out.println("Enter a number2 get muls :");
        int b=sc.nextInt();

        printN_Common_Multiples(n, a, b);
    }
}
