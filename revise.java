/*Write a Java program to check whether a given number is even or odd. 

import java.util.*;
public class revise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }
    
}
*/



/*Input two numbers and print the larger one 

import java.util.*;
public class revise{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number one:");
        int num1 = sc.nextInt();

        System.out.print("Enter number two:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("number one is greater");
        }
        else if(num2>num1){
             System.out.println("number two is greater");
        }
        else{
            System.out.println("both the numbers are equal");
        }


    }
}*/



/*Use a loop to calculate the sum of the first N natural numbers. 
import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter n: ");
        int n=sc.nextInt();
        
        int sum=0;

        for(int i=1; i<=n; i++){
           
            sum+=i;

        }

        System.out.println("sum: " +sum);


    }
}*/




/*Print the multiplication table of a given number. 
import java.util.*;
public class revise{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mul;

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.print("Enter number till where you want to print numbers: ");
        int num=sc.nextInt();

        System.out.println("Multiplication table of " + n + " is: ");
        for(int i=1; i<=num; i++){
            mul=n*i;
             System.out.println(n + " * " + i + " = " + mul );
            
        }

       

    }
}*/


/*Count the number of digits in a given integer. 
import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int num=sc.nextInt();

        int count = 0;

        for(int i=0; i<num; i++){
            if(num==0){
                count = 1;
            }
            while(num!=0){
                num = num/10;
                count++;
            }

        }
        System.out.println("number of digits in a number : " +count);




    }
}*/




/*Using switch, perform:
Addition
Subtraction
Multiplication
Division */

import java.util.*;
public class revise{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number one: ");
        int num=sc.nextInt();

        System.out.println("Enter the number two: ");
        int num2=sc.nextInt();

        System.out.println("enter ypur choice 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                int sum=num+num2;
                System.out.println("Addition: " + sum);
                break;

            case 2:
                int sub=num-num2;
                
                System.out.println("Subtraction: " + sub);
                break;

            case 3:
                int mul=num*num2;
                System.out.println("Multiplication: " + mul);
                break;


            case 4:
                if(num2!=0){
                    double div=(double)num/num2;
                    System.out.println("Division: " + div);

                }
               else{
                    System.out.println("Cannot divide by zero");
                }
                
                break;

            default:
                System.out.println("Invalid choice");

        }



        
    }
}