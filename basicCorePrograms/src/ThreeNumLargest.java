//Java Program to Find the Largest Among Three Numbers


import java.util.*;
public class ThreeNumLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number 1:");
        int num1=sc.nextInt();

        System.out.print("Enter number 2:");
        int num2=sc.nextInt();

        System.out.print("Enter number 3:");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("number 1 is largest");
        }else if(num2>num1 && num2>num3){
            System.out.println("number 2 is largest");
        }else if(num3>num1 && num3>num2){
            System.out.println("number 3 is largest");
        }else if(num1==num2 && num2==num3){
            System.out.println("All three numbers are equal");
        }else{
            System.out.println("Two numbers are equal and greater than the third");
        }

    }

}
