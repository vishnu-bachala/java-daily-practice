package basic;

import java.util.Scanner;

public class Armstrong {
    static int countDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void isArmstrong(int n){
        int sum=0 , temp=n;
        int power=countDigits(n);

//        int power=(int)Math.log10(n)+1;     ==> this way we also get len of numeric value

        while(n>0){
            sum=sum+(int)Math.pow(n%10,power);
            n=n/10;
        }
        if(temp==sum) System.out.println("Is armstrong 😁 ");
        else System.out.println("is not Armstrong 😪");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n =sc.nextInt();

        isArmstrong(n);
    }
}
