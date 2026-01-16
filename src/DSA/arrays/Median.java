package DSA.arrays;

public class Median {
    // find median of two sorted arrays
    static float findMedian(int[] ar1, int[] ar2) {
        if (ar2.length < ar1.length) {
            return findMedian(ar2, ar1);
        }
        int l = 0, h = ar1.length;

        while (l <= h) {
            int m1 = (l + h) / 2;
            int m2 = ((ar1.length + ar2.length) + 1) / 2 - m1;

            int l1 = (m1 == 0) ? Integer.MIN_VALUE : ar1[m1 - 1];
            int r1 = (m1 == ar1.length) ? Integer.MAX_VALUE : ar1[m1];
            int l2 = (m2 == 0) ? Integer.MIN_VALUE : ar2[m2 - 1];
            int r2 = (m2 == ar2.length) ? Integer.MAX_VALUE : ar2[m2];

            if (l1 <= r2 && l2 <= r1) {
                // find median
                if ((ar1.length + ar2.length) % 2 == 0) {
                    return ((float) (Integer.max(l1, l2) + Integer.min(r1, r2))) / 2;
                } else {
                    return (float) Integer.max(l1, l2);
                }

            } else if (l2 > r1) {
                l = m1 + 1;
            } else {
                h = m1 - 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 8};
        int[] ar2 = { 9, 12,3};

        float median = findMedian(ar1, ar2);
        System.out.println(median);
    }
}
