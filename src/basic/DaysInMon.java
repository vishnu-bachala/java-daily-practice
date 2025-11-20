package basic;

import java.util.Scanner;

public class DaysInMon {
    private static void findDays(String mon) {
        switch (mon){
            case "january" , "march" , "may" , "july" , "august" , "october" -> System.out.println("31 days");
            case"february" -> System.out.println("28 days");
            case "april","june","september","november" -> System.out.println("30 days");
            default -> System.out.println("invalid month" + mon);
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month :");
        String mon=sc.nextLine();

        findDays(mon);
    }

}
