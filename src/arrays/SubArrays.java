package arrays;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.BasicArray.sumOfArray;

public class SubArrays {
    public static void subArrays(int [] ar,int size ){
        for(int i=0; i<=ar.length-size;i++){
            for(int j=i; j<size+i;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }

    public static void sumOfSub(int [] ar, int key){

        for(int i=0; i<ar.length-1;i++){
            int sum=0;
            for(int j=i;j<ar.length;j++){
                sum +=ar[j];
                if(sum == key){
                    for(int x=i; x<=j;x++){
                        System.out.print(ar[x] +" ");
                    }
                    System.out.println();
//                    break;

                }
            }
        }
    }


//    public static void sumOfSub(int [] ar, int key){
//
//        for(int i=0; i<ar.length-1;i++){
//            int sum=0;
//            for(int j=i;j<ar.length;j++){
//                sum +=ar[j];
//                if(sum == key){
//                    for(int x=i; x<=j;x++){
//                        System.out.print(ar[x] +" ");
//                    }
//                    System.out.println();
//                    break;
//
//                }
//            }
//        }
//
//    }
//


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] ar1=new int[n1];

        for(int i=0; i<ar1.length;i++){
            ar1[i]= sc.nextInt();
        }

        int size= sc.nextInt();

        sumOfSub(ar1, size);
    }
}
