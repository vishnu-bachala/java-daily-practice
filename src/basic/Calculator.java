package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void cal(char op,double a,double b)  {
        switch (op) {
            case '+': System.out.println("sum :" + (a + b)); break;
            case '-': System.out.println("subtraction :" + (a - b)); break;
            case '*': System.out.println("mul :" + (a * b));break;
            case '/':
                if (b == 0) throw new ArithmeticException("zero division error");
                System.out.println("div :" + (a / b)); break;
            case '%':
                if (b == 0) throw new ArithmeticException("can bot perform % operation");
                System.out.println("modulo: " + (a % b)); break;
            default:
                System.out.println("invalid operation" + op);
        }
    }
    public static void main(String [] args){
        try(Scanner sc = new Scanner(System.in)) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            System.out.println("operation in {+|-|*|/|%} :");
            char op = sc.next().charAt(0);

            cal(op, a, b);
        }

        catch (InputMismatchException e) {
            System.out.println("input mismatch");
        }
        catch(ArithmeticException | IllegalArgumentException e){
            System.out.println("error:"+ e.getMessage());
            }
    }
}
