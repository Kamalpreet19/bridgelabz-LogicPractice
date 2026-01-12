//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.*;
public class VowelConsonant {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("enter an alphabet:");
             char c=sc.next().charAt(0);

             if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                 System.out.println("it is a vowel");
             }else if((c>='a' && c<='z') || (c>='A' && c<='Z') ){
             System.out.println("it is a consonant");
             }else{
                 System.out.println("please enter a valid input");
             }

         }
         }




