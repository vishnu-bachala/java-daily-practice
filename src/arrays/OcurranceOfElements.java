package arrays;

import java.util.Scanner;

public class OcurranceOfElements {

    //occurrence of elements
    public static void occurrenceOfElement(int [] ar){
        int count=1;
        for(int i=0; i<ar.length-1;i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                System.out.println(ar[i]+" - "+ count);
                count=1;
            }
        }
        System.out.println(ar[ar.length-1]+" - "+ count);
    }

    //occurrence of elements
    public static void elementsInArray(int [] ar){

        for(int i=0; i<ar.length-1;i++){
            if(ar[i] != ar[i+1]){
                System.out.println(ar[i]);
            }
        }
        System.out.println(ar[ar.length-1]);
    }

   public static void uniqueElements(int [] ar){
        int count=1;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    System.out.println(ar[i]);
                }
                count = 1;
            }
        }
        if(count==1) {
            System.out.println(ar[ar.length - 1]);
        }
    }

    // count of unique elements in array
    public static int countOfUniqueElements(int [] ar){
        int count=1, uniqueElement=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    uniqueElement++;
                }
                count = 1;
            }
        }
        if(count==1) {
            uniqueElement++;
        }
        return uniqueElement;
    }

    // highest pair value in sorted array

    public static int highestPairValue(int [] ar){
        for(int i=ar.length-1; i>=1; i--){
            if(ar[i] == ar[i-1]){
                return ar[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array :");
        int n=sc.nextInt();

        int[] ar=new int[n];
        System.out.println("Enter the elements of array in sorted:");

        for(int i=0; i<n;i++){
            ar[i]=sc.nextInt();
        }

        System.out.println(highestPairValue(ar));
    }
}
