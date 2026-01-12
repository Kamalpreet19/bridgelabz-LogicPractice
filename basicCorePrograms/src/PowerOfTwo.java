//Power of 2
//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.



import java.util.*;
public class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = sc.nextInt();

        if (N >= 0 && N < 31) {
            for (int i = 0; i <= N; i++) {
                System.out.print((int)Math.pow(2,i) + " ");
            }
            System.out.println();
        }
    }

}
