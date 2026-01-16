package DSA.arrays;

import java.util.Scanner;

public class CeilAndFlor {

    // finding the ceil given input in the array
    static int findCEIL(int [] ar,int key){
        int low=0, high= ar.length-1, mid=0;
        while(low <= high){
            mid=(low+high)/2;

            if(key == ar[mid]) return ar[mid];
            else if (key < ar[mid]) high=mid-1;
            else low =mid+1;
            }
        if(low < ar.length) return ar[low];
        else return -1;
    }

    // floor in array

    static int findFLOOR(int [] ar,int key){
        int low=0, high= ar.length-1, mid=0;
        while(low <= high){
            mid=(low+high)/2;

            if(key == ar[mid]) return ar[mid];
            else if (key < ar[mid]) high=mid-1;
            else low =mid+1;
        }
        if(high >= 0) return ar[high];
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] ar=new int[n];


        for(int i=0;i<n;i++){
            ar[i]=scanner.nextInt();
        }
        System.out.println("Enter key :");
        int k=scanner.nextInt();

        int ceil = findCEIL(ar, k);
        System.out.println(ceil);

        int floor=findFLOOR(ar,k);
        System.out.println(floor);
    }
}
