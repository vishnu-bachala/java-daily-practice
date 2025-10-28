package Exceptions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArthematicOp {
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the First value :");
            int num = sc.nextInt();
            System.out.println("Enter the Second value :");
            int num1 = sc.nextInt();

            double div= (float) num /num1;
            System.out.printf("Division : %.2f%n", div);
        }
        catch (ArithmeticException | InputMismatchException e){
            System.err.println(e);
        }

        finally {
            System.out.println("! Don't try division with zero.");
        }

    }
}
