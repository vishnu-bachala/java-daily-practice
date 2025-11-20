package basic;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void printPrimes(int n, int m){
        for (int i=n;i<=m;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void primes(int n){
        int count=0;
        for( int i=2; count<n; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }

        }
    }
    public static void nThprimeNumber(int n){
        int count=0;
        int temp=0;
        for( int i=2; count<n; i++){
            if(isPrime(i)){
                temp=i;
                count++;
            }
        }
        System.out.println(temp);
    }
    public static int countPrimes(int n){
        int count=0;
        for (int i=2;i<=n ;i++){
            if(isPrime(i)){
                count +=1;
            }
        }
        return count;
    }
    public static void Factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  starting value :");
        int num=sc.nextInt();

//        System.out.println("Enter a ending value :");
//        int num2=sc.nextInt();

          // calling function
//        printPrimes(num,num2);
//        primes(num);
//        nThprimeNumber(num);

        System.out.println(countPrimes(num));

    }

}
