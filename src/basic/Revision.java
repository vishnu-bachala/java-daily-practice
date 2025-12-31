package basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {
    public static String isLeap(int n){
        if((n%100 !=0 && n%4==0) || (n%400==0)){
            return n+" is leap year";
        }
        return n+" not a leap year";
    }
    public static Integer isPrime(int n,int m){
        int c=0;int temp=0;
        for(int j=n;j<=m;j++) {
            int count=0;
            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if(count==0){
                temp=j;
                c++;
            }
        }
        return temp;
    }

    static int HCF(int n, int m){
        while(m!=0){
            int temp=m;
            m=n%m;
            n=temp;
        }
        return n;
    }
    static int LCM(int n ,int m){
        return (n*m)/HCF(n,m);
    }

    static void lcm(int n, int m){
        int i = n > m ? n : m;
        int j=i;
        while(j>=i){
            if(j%n==0 && j%m==0){
                System.out.println(j);
                break;
            }
            j=j+i;
        }
    }

    static void doWhile(int n){
        do{
            System.out.println("hello");
            n--;
        }
        while(n>=0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String s="vishnu";
        String s2="vish";
        int i = s2.indexOf("vi");
        boolean b=s.isEmpty();

        String substring = s.substring(0, s.length() - 1);
        System.out.println("sub  :"+substring);
        System.out.println(b);
        System.out.println(i);

        String [] ar=null;
        System.out.println(ar);
    }
}
