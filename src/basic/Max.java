package basic;

import java.util.Scanner;

public class Max {
    public static  int maxOfValues(int a, int b , int c){
        return Math.max(a, Math.max(b,c));
    }
    public static void  main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number1:");
        int n1=sc.nextInt();
        System.out.println("Enter a number2:");
        int n2=sc.nextInt();
        System.out.println("Enter a number3:");
        int n3=sc.nextInt();

        // calling method
        System.out.println("max is " + (maxOfValues(n1,n2,n3)));

//        if (n1>n2 & n1>n3) System.out.println("max is "+n1);
//        else if (n2>n1 & n2>n3) System.out.println("max is "+n2);
//        else System.out.println("max is "+ n3);

    }
}
