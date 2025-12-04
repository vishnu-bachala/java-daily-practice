package arrays;

import java.util.Scanner;

public class ReArrange {

    // print -1 first in array remaining number in after -1 "-1-1124324"
    public static void reArrangeArray(int[] ar) {
        int i = ar.length - 1, j = ar.length - 1;
        while (i >= 0) {
            if (ar[i] == -1) {
                i--;
            } else {
                ar[j--] = ar[i--];
            }
        }
        while (j >= 0) {
            ar[j--] = -1;
        }
    }

    // print 0 at last numbers in array 2345657000
    public static void reArrangeLast(int[] ar) {
        int i = 0, j = 0;

        while (i < ar.length) {
            if (ar[i] == 0) {
                i++;
            } else {
                ar[j++] = ar[i++];
            }
        }
        while (j < ar.length) {
            ar[j++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        // sample test case 8 -1 3 -1 4 3 5 -1 4 1
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        reArrangeLast(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
