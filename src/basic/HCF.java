package basic;

import java.util.Scanner;

public class HCF {
    public static void hcf(int n, int m){
       int min= n < m ? n : m;
       for(int i=min;i>=1;i--){
           if(n%i==0 && m%i==0){
               System.out.println(i);
               break;
           }
       }
    }
    public static int hcfMethod2(int n, int m){

            while (m != 0) {
                int temp = m;
                m = n % m;
                n = temp;
            }
            return n;
    }
    public static int hcfMethodRecursive(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return hcfMethodRecursive(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        // calling method
        System.out.println(hcfMethod2(n1,n2));
        System.out.println(12%18);
    }
}
