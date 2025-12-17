package collections;

import java.util.*;

public class Day1 {


    // print chars in string without duplicates
    public static Set<Character> printCharsWithOutDuplicates(String s) {
        Set<Character> chars = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        return chars;
    }

    //print url separate in given sinle string seperated by commas
    // input==> www.amazon.com,www.fb.com,www.amazon.kindle.com,www.insta.com,www.amazon.com,www.fb.com
    public static Set<String> printUrlsWithOutDuplicates(String s) {
        Set<String> links = new HashSet<>();
        String[] urls = s.split(",");
        Collections.addAll(links, urls);
        return links;
    }

    //print url separate in given sinle string seperated by commas
    // input==> www.amazon.com,www.fb.com,www.amazon.kindle.com,www.insta.com,www.amazon.com,www.fb.com
    public static Set<String> printSitesWithOutDuplicates(String s) {
        Set<String> apps = new HashSet<>();
        String[] urls = s.split(",");

        for (String u : urls) {
            String[] url = u.split("\\.");
            apps.add(url[1]);
        }
        return apps;
    }

    // print words in given string without duplicates
    public static Set<String> words(String s) {
        Set<String> word = new LinkedHashSet<>();
        String[] words = s.split("[ ,.()]+");

        Collections.addAll(word, words);

        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        Set<String> res = words(s);
        for (String w : res) {
            System.out.println(w);
        }

    }
}
