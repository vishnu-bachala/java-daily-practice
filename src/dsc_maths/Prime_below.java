package dsc_maths;

import java.util.Scanner;


public class Prime_below {
    static void primes(int n){
        boolean [] prime= new boolean[n+1];

        for(int i=2; i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2; i<prime.length;i++){
            if(! prime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=scanner.nextInt();

        primes(n1);

    }
}
