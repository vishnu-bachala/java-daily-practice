package basic;

import java.util.Scanner;

public class Swap {
    private static void swaping(int a, int b) {
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
    private static void swaping2(int a, int b) {  // without temp variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a1 ="+a);
        System.out.println("b1 ="+b);
    }

    public static int sumOfTwo(int n, int m){
        return n+m;
    }

    //123= 1+2+3=6
    public static int SumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }

    // count digits ==> 12345=5
    public static int digits(int n){
        int count =0;
        while(n>0){
            count+=1;
            n=n/10;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 'a' value :");
        int a= sc.nextInt();
//        System.out.println("Enter 'b' value :");
//        int b= sc.nextInt();

        // method calls
//        swaping(a,b);
//        swaping2(a,b);
//        System.out.println(sumOfTwo(a,b));   // sum_of_two
//        System.out.println(SumOfDigits(a));  // sumOf_digits
        System.out.println("total digits :"+digits(a));
    }
}
