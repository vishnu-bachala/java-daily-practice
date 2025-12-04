package arrays;

import java.util.Arrays;
import java.util.Scanner;

// merging and sorted
public class MergeArrays {

    public static int [] sorting(int [] ar){
        int temp=0;
        for(int i=0; i<ar.length-1;i++){
            for(int j=i+1;j<ar.length; j++){
                if(ar[i] > ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar;
    }
    public static int [] mergeArrays(int[] ar1, int [] ar2){
        int [] newArray=new int[ar1.length+ ar2.length];
        for(int i=0; i<ar1.length; i++){
            newArray[i]=ar1[i];
        }
        for(int j=0; j< ar2.length; j++){
            newArray[ar1.length+j]=ar2[j];
        }
        return sorting(newArray);
    }
    public static int[] mergingSortedArrays(int[] ar1, int[] ar2) {
        int[] res = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]) {
                res[k] = ar1[i];
                i++;
                k++;
            } else {
                res[k] = ar2[j];
                j++;
                k++;
            }
        }
        while (i < ar1.length) {
            res[k] = ar1[i];
            i++;
            k++;
        }
        while (j < ar2.length) {
            res[k] = ar2[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array 1 : ");
        int n1 = sc.nextInt();
        int[] ar1 = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = sc.nextInt();
        }

        System.out.println("Enter length of Array 2 : ");
        int n2 = sc.nextInt();
        int[] ar2 = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = sc.nextInt();
        }

//        int [] result = mergingSortedArrays(ar1, ar2);
//        System.out.println(Arrays.toString(result));

        int [] result = mergeArrays(ar1,ar2);
        System.out.println(Arrays.toString(result));

    }
}
