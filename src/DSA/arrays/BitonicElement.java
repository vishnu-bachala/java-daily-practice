package DSA.arrays;

// bitonic means the array strictly increase and Strictly decrease the peak element is bitonic

/* {1,2,3,4,2,1}=> bitonic is = 6 */
public class BitonicElement {
    //find index of bitonic element
    static int bitonicElementIndex(int[] ar){
        int left=0, right=ar.length-1, mid=0;

        while(left <= right){
            mid =(left+right) /2;

            if(ar[mid] > ar[mid-1] && ar[mid]>ar[mid+1]){
                return mid;
            } else if (ar[mid]>ar[mid-1] && ar[mid]<ar[mid+1]) {
                left = mid;
            }
            else{
                right = mid;
            }
        }
        return -1;
    }

    //first half => Ascending search
    static int ascendingSearch(int [] ar, int range, int key){
        int l=0, h=range, mid=0;

        while(l<=h){
            mid= (l+h)/2;

            if(key == ar[mid]) {
                return mid;
            }
            else if (key < ar[mid] ) {
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }

    // second half => descendingSearch
    static int descendingSearch(int[] ar, int range, int key){
        int l=range, h=ar.length-1, mid=0;

        while(l<=h){
            mid= (l+h)/2;

            if(key == ar[mid]) {
                return mid;
            }
            else if (key < ar[mid] ) {
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return -1;
    }


    // main logic to find given "key"  in bitonic array
    static int searchIndexOfKey(int[] ar,int bIndex,int key){
        if(key == ar[bIndex]) return bIndex;
        if(key > ar[bIndex]) return -1;

        int res1= ascendingSearch(ar,bIndex-1,key);
        if(res1 > -1) return res1;

        int res2= descendingSearch(ar,bIndex+1,key);
        if(res2 > -1) return res2;

        return -1;
    }


    public static void main(String[] args) {
        int [] ar={4,5,7,12,3,2,1,-4};
        int k=1;

        int bIndex = bitonicElementIndex(ar);
        System.out.println(bIndex);

        int i = searchIndexOfKey(ar, bIndex, k);
        System.out.println(i);

    }
}
