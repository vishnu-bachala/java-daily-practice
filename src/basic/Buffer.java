package basic;

public class Buffer {
    public static void main(String [] args){
        // no.of terms = nth value - a/d
        // nth value = (n-1)d+a
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("estoy contento");
        StringBuffer sb2 = new StringBuffer("estoy treste");

        sb.insert(0," = iam happy");
        System.out.println(sb);
        System.out.println("=====================");
        sb1.append(sb);
        System.out.println(sb1);
        System.out.println("=====================");
        sb2.append(" = i'm sad");
        System.out.println(sb2);
        System.out.println("=====================");
        sb.reverse();
        System.out.println(sb);
        System.out.println("=====================");
        System.out.println(sb2.hashCode());
        System.out.println("=====================");
        String finalStr = sb1.toString();
        System.out.println("immutable String :: "+finalStr);

    }
}
