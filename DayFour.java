
/*Check whether a number is prime. 
import java.util.*;
public class DayFour{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        int count = 0;

        if(num<=1){
            System.out.println("not prime");
        }
        else{

        for(int i=1; i<=num; i++){
            if(num%i==0){
               count++;
            }
        }
    

    if(count==2){
        System.out.println("prime number");
    }
    else{
        System.out.println("not a prime number");
    }


        }
    }
}*/




/*check whether a number is palindrome or not 
import java.util.*;
public class DayFour{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;

        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int temp=num;
        while(num!=0){
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }



    }
}*/




/*Print the first N terms of the Fibonacci series. 
import java.util.*;
public class DayFour{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num=sc.nextInt();

        int a=0;
        int b=1;

        for(int i=0;i<num; i++){
            System.out.print(a + " ");
            int next=a+b;
            a=b;
            b=next;
        }


        
    }
}*/



/*check whether a number is armstrong number or not 
import java.util.*;
public class DayFour{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;

        while(num!=0){
            int digit = num%10;
            sum+=digit*digit*digit;
            num=num/10;

        }
        if(temp==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }


    }
}*/


/*check if number is factorial number 
import java.util.*;
public class DayFour{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of number : " + fact);

    }
}*/




/* print 
1
2 2
3 3 3 
4 4 4 4 

public class DayFour{
    public static void main(String args[]){
    for(int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
        System.out.print(i + " ");
    }
    System.out.println();
}

 
}
}*/






/*check if the two strings are anagram or not */
import java.util.*;
public class DayFour{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the string 1: ");
        String str1=sc.next();

        System.out.print("Enter the string 2: ");
        String str2=sc.next();

        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();

        
        if(c1.length != c2.length){
           System.out.println("Not anagrams");
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

       boolean isAnagram = true;

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
            
        }

    }



/* I have two array of strings 
arr1[] = { 'a' , 'b' , 'c' , 'd' , 'e'}
arr2[] = { 'c' , 'd' , 'e' , 'f' , 'g'} 
print the common elements


public class DayFour{
    public static void main(String args[]){
        
        String arr1[]={ "a" , "b" , "c" , "d" , "e"};
        String arr2[]={ "g" , "c" , "d" , "e" , "f"};

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    
                }
            }
        }
    }
}*/