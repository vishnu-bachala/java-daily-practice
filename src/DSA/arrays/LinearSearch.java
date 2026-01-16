package DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    // find index of key, tc=O(n)
    static int linearSearch(int[] ar, int key){
        for(int i=0;i<ar.length;i++){
            if(ar[i] == key){
                return i;
            }
        }
        return -1;
    }

    // find position of key tc=O(log n)
    static int binarySearch(int[] ar,int key){
        Arrays.sort(ar);
        int low=0, high=ar.length-1, mid=0;

        while(low <= high){
            mid= low + high/2;
            if(key == ar[mid]){
                return mid;
            }
            else if(key < ar[mid]){
                high=mid-1;
                // low=low
            } else {
                low=mid+1;
                // high=high
            }
        }
        return -1;
    }

    // passes all test cases
    static int updatedBinarySearch(int[] ar,int key){
        Arrays.sort(ar);
        int low=0, high=ar.length-1, mid=0;
        int result=-1;

        while(low <= high){
            // avoid neg mid-index when dealing with large numbers
            mid= low + (high-low)/2;
            if(key == ar[mid]){
                result=mid;
                high = mid-1;
            }
            else if(key < ar[mid]){
                high=mid-1;
                // low=low
            } else {
                low=mid+1;
                // high=high
            }
        }
        // it returns first occurrence key in array else not found key returns -1.
        return result;

    }

    // span of array = to find diff bw larger and smaller element in array
    static int spanOfArray(int[] ar){
        if(ar.length == 0) return -1;
        int max=ar[0], min=ar[0];

        for(int i:ar){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        return max-min;
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();  // array size
        int[] ar=new int[n];

        System.out.println("Enter key to find position : ");
        int k=scanner.nextInt();

        for(int i=0;i<n;i++){
            ar[i]=scanner.nextInt();
        }

        int i = updatedBinarySearch(ar, k);
        System.out.println(i);

    }
}
