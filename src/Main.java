
import java.util.Scanner;

import static basic.Factorial.fact;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        factorial(num,num);
//        System.out.println(n);
    }
    int count=0;
    private static void factorial(int i, int n) {
        if(i<1) return;
        factorial(i-1,n);
        System.out.print(i+ " ");
    }
}


