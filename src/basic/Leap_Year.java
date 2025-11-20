package basic;

import java.util.Scanner;

public class Leap_Year {
    public static void isLeap(int year){
        if((year % 4 ==0 && year%100 !=0 ) || (year%400==0))
             System.out.println(year+" leap year");
        else System.out.println(year+" not a leap year");
    }
    private static void findDays(String mon,int year) {
        switch (mon){
            case "january" , "march" , "may" , "july" , "august" , "october" ->
                    System.out.println("31 days");
            case"february" -> {
                if ((year % 4 ==0 && year%100 !=0 ) || (year%400==0)) {
                System.out.println("29 days");
                }
                else {
                        System.out.println("28 days");
                    }
            }
            case "april","june","september","november" -> System.out.println("30 days");
            default -> System.out.println("invalid month" + mon);
        }
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month :");
        String mon=sc.nextLine();

        System.out.println("Enter year:");
        int year=sc.nextInt();

        isLeap(year);

        findDays(mon.toLowerCase(),year);
    }
}

