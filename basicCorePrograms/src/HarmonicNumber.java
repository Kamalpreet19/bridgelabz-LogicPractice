//Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.

import java.util.*;
public class HarmonicNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number:");
        int num=sc.nextInt();

        double result=0.0;

        if(num<=0){
            System.out.println("please enter a positive number");
            return;
        }
        for(int i=1;i<=num;i++){
            result=result+(double)1/i;

        }
        System.out.print("Result: " +result);


    }
}
