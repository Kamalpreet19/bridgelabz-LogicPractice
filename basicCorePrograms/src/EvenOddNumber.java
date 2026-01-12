//Java Program to Check Whether a Number is Even or Odd

import java.util.*;
public class EvenOddNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.print("number is even");
        }else{
            System.out.print("number is odd");

        }
    }

}
