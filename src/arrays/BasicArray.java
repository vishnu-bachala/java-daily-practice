package arrays;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.ArrayTraversal.arrayProduct;

public class BasicArray {

    public static int sumOfArray(int [] ar){
        int sum=0;
        for(int i:ar){
            sum=sum+i;
        }
        return sum;
    }
    // largest element
    public static int largest(int [] ar){
        int max=Integer.MIN_VALUE;
        for(int i=0; i< ar.length; i++){
            if (ar[i] > max ) {
                max=ar[i];
            }
        }
        return max;
    }

    // smallest
    public static int smallest(int [] ar){
        int min=Integer.MAX_VALUE;
        for(int i=0; i< ar.length; i++){
            if (ar[i] < min ) {
                min=ar[i];
            }
        }
        return min;
    }


    // index of largest element
    public static int largest_Index(int [] ar){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0; i< ar.length; i++){
            if (ar[i] > max ) {
                index=i;
                max=ar[i];
            }
        }
        return index;
    }

    // occurrence of element K in array
    public static int occurrenceOfElement(int [] ar, int k){
        int count=0;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == k){
                count++;
            }
        }
        return count;
    }
    // index of K
    public static int indexOfElement(int [] ar, int k){
        for(int i=0; i<ar.length; i++){
            if(ar[i] == k){
                return i;
            }
        }
        return -1;
    }

    // largest and smallest of n-1 elements in array
    public static void largeAndSmallSum(int [] ar){
        int sum=sumOfArray(ar);
        int min=smallest(ar);
        int max= largest(ar);

        System.out.println("highest_sum is " + (sum-min));
        System.out.println("highest_sum is " + (sum-max));
    }

    // PRODUCT OF N-1 ELEMENTS IN ARRAY
    public static void productN_1(int [] ar){
        int P = (int) arrayProduct(ar);
        for(int i=0; i< ar.length; i++){
            System.out.print (P/ar[i]+" ");
        }
    }

    public static int[] productN_1_(int [] ar){
        int P = (int) arrayProduct(ar);
        int [] res=new int[ar.length];

        for(int i=0; i< ar.length; i++){
            res[i] = P/ar[i];
        }
        return res;
    }

    // print SECOND largest element in array
    public static int secondLargest(int [] ar){
        int big=Integer.MIN_VALUE, temp=Integer.MIN_VALUE;

        for(int i=0; i<ar.length; i++){
            if(ar[i] > big){
                temp=big;
                big=ar[i];
            }
            else if (ar[i] > temp){
                temp=ar[i];
            }
        }
        return temp;
    }

    // print SECOND largest element in array non_same
    public static int secondLargest_(int [] ar){
        int big=Integer.MIN_VALUE, temp=Integer.MIN_VALUE;

        for(int i=0; i<ar.length; i++){
            if(ar[i] > big){
                temp=big;
                big=ar[i];
            }
            else if (ar[i] > temp && ar[i] != big){
                temp=ar[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt();

        int [] ar= new int[n];

//        System.out.println("enter k :");
//        int k=sc.nextInt();

        // inputs taken from user into array
        for(int i=0; i<ar.length;i++){
            System.out.print("Enter index element of "+i +" :");
            ar[i]= sc.nextInt();
        }

        int res = secondLargest(ar);
        System.out.println(res);
    }
}
