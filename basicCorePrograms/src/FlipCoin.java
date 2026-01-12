//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails

import java.util.*;
import java.util.Random;
public class FlipCoin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int tail=0;
        int head=0;

        System.out.print("Enter number of times to flip a coin:");
        int flipCoin=sc.nextInt();
        Random r = new Random();

        for(int i=1;i<=flipCoin;i++) {
            double num = r.nextDouble();

            if (num < 0.5) {
                tail++;
            } else {
                head++;
            }
        }

        double tailPercent = (tail*100.0)/flipCoin;
        double headPercent = (head*100.0)/flipCoin;

        System.out.println("Tail percentage : " + tailPercent);
        System.out.println("Head percentage : " + headPercent);
    }

}
