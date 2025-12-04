package arrays;

import java.util.Scanner;

public class ConsecutiveArrays {
    // consecutive arrays
   public static void consecutiveArray(int [] ar){
       for(int i=0; i<ar.length-1;i++){
           if(ar[i+1]-ar[i]==1){
               System.out.print(ar[i]+" ");
           }
           else{
               System.out.print(ar[i]+" ");
               System.out.println();
           }
       }
       System.out.print(ar[ar.length-1]);
    }

    // length of consecutive arrays
    public static void lenConsecutiveArray(int [] ar){
       int count=1;
        for(int i=0; i<ar.length-1;i++){
            if(ar[i+1]-ar[i]==1){
                count++;
            }
            else{
                System.out.println(count);
                count=1;
            }
        }
        System.out.println(count);
    }

    // longest len of consecutive sub array
    public static int longestLenConsecutiveArray(int [] ar){
        int count=1, max=0;
        for(int i=0; i<ar.length-1;i++){
            if(ar[i+1]-ar[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
        }
        return max;
    }

    // print longest consecutive sub array
    public static void printLongestLenConsecutiveArray(int [] ar){
        int count=1, max=0, index=0;
        for(int i=0; i<ar.length-1;i++){
            if(ar[i+1]-ar[i]==1){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    index=i;
                }
                count=1;
            }
        }
        if(count>max){
            max=count;
            index=ar.length-1;
        }
        for(int i=index-max+1;i<=index;i++){
            System.out.print(ar[i]+" ");
        }
//        System.out.println(max);
//        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n=sc.nextInt();

        int [] ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        // method calling starts here

//        lenConsecutiveArras(ar);
        printLongestLenConsecutiveArray(ar);
    }
}
