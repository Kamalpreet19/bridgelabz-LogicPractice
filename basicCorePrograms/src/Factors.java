//Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.


import java.util.*;
public class Factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N:");
        int N=sc.nextInt();

        for(int i=2;i*i<=N;i++){
            while(N%i==0){
                System.out.print(i + " ");
                N=N/i;
            }
        }
        if(N>1){
            System.out.println(N);
        }

    }
}
