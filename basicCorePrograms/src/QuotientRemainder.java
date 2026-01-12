//Java Program to Compute Quotient and Remainder

import java.util.*;
public class QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend:");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor:");
        int divisor = sc.nextInt();


        if (divisor == 0) {
            System.out.println("division by zero is not possible");
        } else {
            int rem = dividend % divisor;
            System.out.println("Remainder:" + rem);

            int quo = dividend / divisor;
            System.out.println("Quotient:" + quo);



        }
    }
}