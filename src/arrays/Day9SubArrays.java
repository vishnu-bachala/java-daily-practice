package arrays;

import java.util.Scanner;

public class Day9SubArrays {

    // sub Arrays of size n
    public static void subArrays(int [] ar, int size){
        for(int i=0; i<= ar.length-size;i++){
            for(int j=i; j< size+i;j++){
                System.out.print(ar[j]+ " ");
            }
            System.out.println();
        }
    }

    // sub Arrays sum
    public static void subArraysSum(int [] ar, int size){
        for(int i=0; i<= ar.length-size;i++){
            int sum=0;
            for(int j=i; j< size+i;j++){
                sum += ar[j];
            }
            System.out.println(sum);
        }
    }

    // sub arrays sum is equal to k
    public static int subArraysSum_eqK(int [] ar, int size, int k){
        int count=0, sum=0;
        for(int i=0; i<= ar.length-size;i++){
            sum=0;
            for(int j=i; j< size+i;j++){
                sum += ar[j];
            }
            if(sum==k) {
                count++;
            }
        }
        return count;
    }

    public static void printSubArraysSum_eqK(int [] ar, int size, int k){
        int count=0, sum=0;
        for(int i=0; i<= ar.length-size;i++) {
            sum = 0;
            for (int j = i; j < size + i; j++) {
                sum += ar[j];
            }
            if (sum == k) {
                for (int j = i; j < size + i; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
        }
    }

    // print sub arrays in reverse order of size n
    public static void subArraysReverse(int [] ar, int size){
        for(int i=ar.length-1;i>=size-1;i--){
            for(int j=i; j> i-size;j--){
                System.out.print(ar[j]+ " ");
            }
            System.out.println();
        }
    }


    //print all subarrays

    public static void printSubArrays(int[] ar) {
        for (int size = 1; size <= ar.length; size++) {
            for (int i = 0; i <= ar.length - size; i++) {
                for (int j = i; j < size + i; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] ar=new int[n];

        for(int i =0; i<n;i++){
            ar[i]=sc.nextInt();
        }

        int size=sc.nextInt();
        int k=sc.nextInt();

        printSubArrays(ar);


    }
}
