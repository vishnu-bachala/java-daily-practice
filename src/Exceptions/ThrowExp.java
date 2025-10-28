package Exceptions;

import java.util.Scanner;

public class ThrowExp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age= sc.nextInt();
        if(age < 0 | age > 80){
            // throw the exception
            throw new ArithmeticException("Invalid age");
        }
        else{
            System.out.println("valid age"+ age);
        }
    }
}
