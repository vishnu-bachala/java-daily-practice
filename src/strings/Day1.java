package strings;

import java.util.Scanner;


public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 &2 :");
        String s = sc.nextLine();
        String s2 = sc.nextLine();
//        char c = sc.nextLine().charAt(0);

//        String [] res = printWords(s);
// 012345= 103254
//        for(int i = 0; i< res.length/2; i++){
//            System.out.print(res[i]+res[i].length()+" ");

        String[] strings = printWords(s);
        for (String word : strings) {
            System.out.println(word);
        }
    }


    public static String reverseStr(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i) + t;
        }
        return t;
    }

    public static String palindromeStr(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return s + " is not palindrome";
            }
        }
        return s + " is palindrome";
    }

    public static int spacesInStr(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // no.of in string
    public static int wordsInStr(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return s.charAt(0) == ' ' ? count : count + 1;
    }

    //count vowels
    public static int countVowelsInStr(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                count++;

            }
        }
        return count;
    }

    //count consonants
    public static int countConsonantsInStr(String s) {
        int cc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {

                    cc++;

                }
            }
        }
        return cc;
    }


    // print count of each category
    public static void printAllTypesCount(String s) {
        int vc = 0, cc = 0, nc = 0, sc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    vc++;
                } else {
                    cc++;
                }

            } else if (ch >= '0' && ch <= '9') {
                nc++;
            } else {
                sc++;
            }
        }
        System.out.println("Vowels = " + vc);
        System.out.println("Consonants = " + cc);
        System.out.println("Numbers = " + nc);
        System.out.println("Spl Characters = " + sc);
    }

    // print string without Spl Characters

    public static String stringWithoutSplCharacters(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                t = t + ch;
            }
        }
        return t;
    }

    // input = he#ll2o ==> output = hello2
    public static String printAlphabetsAndRemainingCount(String s) {
        String t = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                t = t + ch;
            } else {
                count++;
            }
        }
        return t + count;
    }

    //hel42lo ==> hello3  (4+2=6)
    public static String printAlphabetsAndNumericSum(String s) {
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                t = t + ch;
            } else if (ch >= '0' && ch <= '9') {
                sum = sum + (ch - 48);   //  0=48==> 48-48=0, 49-48=1....55-48=9; ch(0)-->48
            }
        }
        return t + sum;
    }


    // Upper to Lowercase --> HELLO => hello
    public static String toLower(String s) {
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')) {
                t = t + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                t = t + ch;
            } else {
                t = t + ch;
            }
        }
        return t;
    }

    // Upper to Upper case -->  hello ==> HELLO
    public static String toUpper(String s) {
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                t = t + (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                t = t + ch;
            } else {
                t = t + ch;
            }
        }
        return t;
    }

    // upper to lower && lower to upper > heLLo ==> HEllO
    public static String toLowerAndToUpper(String s) {
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')) {
                t = t + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                t = t + ((char) (ch - 32));
            } else {
                t = t + ch;
            }
        }
        return t;
    }


    // remove space start and end > ___hello__are___you___ ==> hello_are_you

    public static String properLining(String s) {
        int si = 0, ei = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                si = i; // first char not a Space
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                ei = i;   // last char not a Space
                break;
            }
        }

        // traverse from si to ei
        String t = "";
        for (int i = si; i <= ei; i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) != ' ' || s.charAt(i + 1) != ' ') {
                t = t + s.charAt(i);
            }
        }

        return t;
    }

    // print * before A|a
    public static String printStar(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                t = t + "*" + s.charAt(i);
            } else {
                t = t + s.charAt(i);
            }
        }
        return t;
    }

    // INDEX OF GIVEN CHAR
    public static int printIndexOfChar(String s, char c) {
        char c1 = c >= 'A' && c <= 'Z' ? (char) (c + 32) : (char) (c - 32);
//        System.out.println(c1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c || s.charAt(i) == c1) {
                return i;
            }
        }
        return -1;
    }


    // SUBSEQUENCE OF STRING EX: HEREIANSTACKERRENK > HAVE > HACKERRANK IN ORDER LEFT TO RIGHT
    public static boolean subSequence(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length();
    }

    // sub strings of given length
    public static void subStrings(String s, int size) {
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < size + i; j++) {
                t = t + s.charAt(j);
            }
            System.out.println(t);
        }
    }

    // all sub strings
    public static void allSubStrings(String s) {
        for (int size = 1; size <= s.length(); size++) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < size + i; j++) {
                    t = t + s.charAt(j);
                }
                System.out.println(t);
            }
        }
    }


    // find s2=>issi presents in s1=>mississippi{
    public static boolean subStringPresents(String s1, String s2) {
        int size = s2.length();
        for (int i = 0; i <= s1.length() - size; i++) {
            String t = "";
            for (int j = i; j < size + i; j++) {
                t = t + s1.charAt(j);
            }
            if (t.equalsIgnoreCase(s2)) {
                return true;
            }
        }
        return false;
    }

    // find s2=>issi presents in s1=>mississippi  op=>2
    public static int noOfSubStringPresents(String s1, String s2) {
        int size = s2.length();
        int count = 0;
        for (int i = 0; i <= s1.length() - size; i++) {
            String t = "";
            for (int j = i; j < size + i; j++) {
                t = t + s1.charAt(j);
            }
            if (t.equalsIgnoreCase(s2)) {
                count++;
            }
        }
        return count;
    }


    // return words in a sentence
    public static String[] printWords(String s) {
        String[] ar = new String[wordsInStr(s)];
        int j = 0;
//        System.out.println(ar.length);
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                t = t + ch;
            } else {
                if (!t.isEmpty()) {
                    ar[j++] = t;
                    t = "";
                }
            }
        }

        if (!t.isEmpty()) ar[j] = t;

        return ar;
    }

    // reverse the words [india is my country =>  country my is india]
}
