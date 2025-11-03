package basic;

import java.util.Scanner;

public class Factorial {
    public static void fact(int number){
        int fact=1;
        int n=number;
        while(number > 0){
            fact=fact*number;
            number --;
        }
        System.out.println("Factorial of "+n +" is "+ fact);
    }
    // using recursion
    public static int recursionFact(int n){
        // base case | stop condition
        if(n==0 | n==1) return 1;
        // logic
        else return n * recursionFact(n-1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want factorial : ");
        int num = sc.nextInt();

        // calling method
        System.out.println("Factorial of "+ num +" is "+ recursionFact(num));
    }
}
