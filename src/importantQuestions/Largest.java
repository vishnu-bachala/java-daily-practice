package importantQuestions;

import java.util.Scanner;

public class Largest {
    //big
    static int biggest(int [] ar){
        int max=ar[0];

        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) max=ar[i];
        }
        return max;
    }

    static int secondBiggest(int [] ar){
        int max=ar[0],temp=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                temp=max;
                max=ar[i];
            }
            else if(ar[i]>temp && ar[i]!=max){
                temp=ar[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int [] ar=new int[n];

        for(int i=0;i<n;i++){
            ar[i]= scanner.nextInt();
        }

        int result=secondBiggest(ar);
        System.out.println(result);

    }
}
