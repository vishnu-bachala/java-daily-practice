package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static String max(int [] ar){
        int big=0;
        for(int i : ar){
            if (big < i)
                big=i;
        }
        return "Largest of all is "+ big;
    }

    // sorting array
    public static void sorted(int [] ar){
        // <== method 1 ==>
//        Arrays.sort(ar);
//        System.out.println("sorted array is :"+Arrays.toString(ar));

        for (int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] > ar[j]){        // f(ar[i] < ar[j])  for descending order
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    // main method starts here
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter range of values you in array :");
        int t=sc.nextInt();

        int [] ar=new int[t];

        for(int i=0 ;i<t; i++){
            System.out.print("Enter value of index "+i +" : ");
            ar[i]=sc.nextInt();
        }

        // method calling
        sorted(ar);
        System.out.println(max(ar));
    }
}
