package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Day8 {
    public static int [] merging3(int [] ar1, int [] ar2, int [] ar3){
        int i=0,j=0,k=0;
        int [] res=new int[ar1.length+ar2.length+ar3.length];

//        while(i<ar1.length || i< ar2.length || i<ar3.length )
        while(i<res.length ){
            if(i<ar1.length) {
                res[k++] = ar1[i];
            }
            if(i<ar2.length) {
                res[k++] = ar2[i];
            }
            if(i<ar3.length) {
                res[k++] = ar3[i];
            }

            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] ar1=new int[n1];
        for(int i=0; i<ar1.length;i++){
            ar1[i]= sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] ar2=new int[n2];
        for(int i=0; i<ar2.length;i++){
            ar2[i]= sc.nextInt();
        }
        int n3=sc.nextInt();
        int [] ar3 =new int[n3];
        for(int i=0; i<ar3.length;i++){
            ar3[i]= sc.nextInt();
        }



        int [] result=merging3(ar1, ar2, ar3);
        System.out.println(Arrays.toString(result));

    }
}
