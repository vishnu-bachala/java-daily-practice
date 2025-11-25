package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    // sum of array
    public static int sumOfProduct(int [] ar){
        int sum=0;
        for(int i=0; i<ar.length;i++){
            sum +=ar[i];
        }
        return sum;
    }

    // product of array
    public static long arrayProduct(int [] ar){
        long product=1;
        for(int i=0; i<ar.length;i++){
            product=product*ar[i];
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int [] ar=new int[size];

        for(int i=0;i<size;i++) {
            ar[i] = sc.nextInt();
        }

//        System.out.println(sumOfProduct(ar));

    }
}
