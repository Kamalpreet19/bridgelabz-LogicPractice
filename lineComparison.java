import java.util.*;
public class lineComparison {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Program");

        System.out.println("Enter x1 and x2: ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();

        System.out.println("Enter y1 and y2:");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();


        /* use case 1: As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the 
        Cartesian System, so that I can calculate its length*/

        double lineOneformula = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        double lineOne=Math.sqrt(lineOneformula);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        System.out.println("Output = " + lineOne );

     /*As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the 
       equal. - Using Java equals method to check equality of 2 Lengths is preferable. */

        System.out.println("Enter x3 and x4: ");
        double x3 = sc.nextDouble();
        double x4 = sc.nextDouble();

        System.out.println("Enter y3 and y4:");
        double y3 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double lineTwoformula = Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2);
        double lineTwo=Math.sqrt(lineTwoformula);

        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
        System.out.println("y3 = " + y3);
        System.out.println("y4 = " + y4);

        System.out.println("Output = " + lineTwo );


        Double lengthOne=lineOne;
        Double lengthTwo=lineTwo;
        if(lengthOne.equals(lengthTwo)){
            System.out.println("Length of lines are equal");
        }else{
            System.out.println("Length of lines are not equal");
        }


        /*As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or
        less than the other line. - Using Java compareTo method to compare 2 Lengths is preferable. */


        int result=lengthOne.compareTo(lengthTwo);
        if(result<0){
            System.out.println("Length of line one is smaller than length of line two ");
        }else if(result>0){
            System.out.println("Length of line one is greater than length of line two ");
        }
          else  {

            System.out.println("Length of both lines are equal");
        }



    }
    
}


