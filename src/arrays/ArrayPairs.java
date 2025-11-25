package arrays;

import java.util.Scanner;

public class ArrayPairs {
    // possible two pairs
    public static void pairs(int [] ar){
        int count=0;
        for(int i=0; i< ar.length-1;i++){
            for(int j=i+1; j< ar.length; j++){
                System.out.println(ar[i] + " " + ar[j]);
                count++;
            }
        }
        System.out.println(count);
    }

    // pairs sum == k
    public static void pairsSum_k(int [] ar, int k){

        for(int i=0; i< ar.length-1;i++){
            for(int j=i+1; j< ar.length; j++){
                if(ar[i] + ar[j] == k){
                    System.out.println(ar[i] +" "+ ar[j]);
                }
            }
        }
    }

    //  pairs sub == k
    public static void pairsSub_k(int [] ar, int k){

        for(int i=0; i< ar.length-1;i++){
            for(int j=i+1; j< ar.length; j++){
                if(ar[i] - ar[j] == k || ar[j] - ar[i]==k){
                    System.out.println(ar[i] +" "+ ar[j]);
                }
            }
        }
    }

    public static void pairs3(int [] ar){
        int count=0;
        for(int i=0; i< ar.length-2;i++){
            for(int j=i+1; j< ar.length-1; j++) {
                for(int k=j+1; k< ar.length;k++) {
                    System.out.println(ar[i] + " " + ar[j]+" "+ar[k]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n= sc.nextInt(); // size

        int [] ar= new int[n]; // array initialization

        System.out.println("enter K :");
        int k=sc.nextInt();

        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            ar[i]=sc.nextInt();
        }
        pairs3(ar);
    }
}
