package basic;

import java.util.Scanner;

public class Main {
    public static void Fibonacci(int n) {
        int a=0, b=1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    // find the number is prime or not
    public static void isPrime(int n){
        int factors=0; // initialize into 0
        for (int i=2;i<=(n/2);i++){
            if(n % i == 0) {
                factors +=1;
                System.out.println("factors are : "+i); // printing the prime factors
            }
        }
        if (factors > 0) System.out.println("is not prime");
        else System.out.println("is prime");
    }
    public static String isPalindromeNum(int n){
        int revNum=0;
        int originalNum = n;
        while(n>0){
            revNum = revNum * 10 +n %10;
            n=n/10;
        }
        return originalNum == revNum ? originalNum+" is palindrome" : originalNum+"not palindrome";
    }
    // armstrong number ex: 153 = 1^3+ 5^3 + 3^3 or 1634= (1+6+3+4)^3
    public static boolean Armstrong(int n){
        double sum=0, givenNUm=n; int len = (int) Math.log10(n)+1;
        System.out.println(len);
        while(n!=0){
            sum=sum+Math.pow((n%10), len);
            n/=10;
        }
        return givenNUm==sum;
    }

    // main method strats here
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
//        System.out.println(isPalindromeNum(num));
        System.out.println(Armstrong(num));
    }
}


