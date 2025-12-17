package collections.map;

import java.util.*;
import java.util.Map.Entry;

public class ProblemsOnMap {

    public static String countChars(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                Integer c = map.get(ch);
                map.put(ch, c + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Entry<Character, Integer>> entries = map.entrySet();
        String t = "";
        for (Entry<Character, Integer> e : entries) {
            t = t + e.getKey() + e.getValue();
        }
        return t;

    }

    // PRINT NUMBER OF PAIRS IN ARRAY
    public static int pairs(int[] ar) {
        HashMap<Integer, Integer> digitCount = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            Integer c=digitCount.getOrDefault(ar[i],0);
            digitCount.put(ar[i],c+1);

           /* if (digitCount.containsKey(ar[i])) {
                Integer c = digitCount.get(ar[i]);
                digitCount.put(ar[i], c + 1);
            } else {
                digitCount.put(ar[i], 1);
            }*/
        }
        int sum=0;
        Collection<Integer> values = digitCount.values();
        for(int e: values){
            int pair=e/2;
            sum=sum+pair;
        }
        return sum;
    }

    public static void repeatedWords3Times(String s){
        LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap<>();
        String [] words=s.split(" ");
        for(String w: words){
            Integer c = wordsCount.getOrDefault(w, 0);
            wordsCount.put(w,c+1);
        }
        Set<String> allWord=wordsCount.keySet();
        for(String w1: allWord){
            int count=wordsCount.get(w1);
            if(count>=3){
                System.out.println(w1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
//        int n = sc.nextInt();
        /*int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }*/

//        int pairs = pairs(ar);
//        System.out.println(pairs);
        repeatedWords3Times(s);
    }
}

