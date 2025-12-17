package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(binary(n));

    }

    public static List<Integer> binary(int n) {
        List<Integer> list = new ArrayList<>();
        String bit = "";
        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1) {
                count++;
            }
            bit = rem + bit;
            n = n / 2;
        }

        list.add(count);

        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') {
                list.add(i + 1);  // index position of 1's
            }
        }

        // [Count of 1's, position os 1's]
        // ex--> 20- [2,4,2]==> [count=2, 4 -> 2^4=16, 2 --> 2^2=4] 16+4=20
        /*for(int i=0;i<bit.length();i++){
            if(bit.charAt(i)=='1'){
                list.add(bit.length()-i-1);
            }
        }*/
        return list;

    }

    private static void allSub(int[] ar, int k) {
        for (int size = ar.length; size >= 1; size--) {
            for (int i = 0; i <= ar.length - size; i++) {
                int sum = 0;
                for (int j = i; j < size + i; j++) {
                    sum += ar[j];
                }
                if (sum == k) {
                    for (int j = i; j < size + i; j++) {
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
        }
    }
}


