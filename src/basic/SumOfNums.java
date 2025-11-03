package basic;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of inputs :");
        int t=sc.nextInt();

        int [] ar = new int[t];

        // reading inputs into array
        for(int i=0;i<t; i++) ar[i] = sc.nextInt();

        // calculating sum n inputs
        for(int number : ar ) sum = sum + number;

        System.out.println("sum of inputs ="+sum);
    }
}
