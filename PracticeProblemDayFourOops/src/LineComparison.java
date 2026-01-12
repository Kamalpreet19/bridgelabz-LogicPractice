

import java.util.*;

abstract class LineLength{
    public abstract void getData();
    public abstract void calculateLength();
    public abstract void calculateLengthTwo();
    public abstract void lineEqual();
    public abstract void lineCompare();
}
class Geometry extends LineLength{
    Scanner sc=new Scanner(System.in);


    private double x1,x2,x3,x4,y1,y2,y3,y4;
    double lineFormula;
    double lineFormula2;
    double line;
    double line2;



        @Override
        public void getData() {
            System.out.print("Enter x1:");
            x1 = sc.nextDouble();

            System.out.print("Enter x2:");
            x2 = sc.nextDouble();

           System.out.print("Enter x3:");
           x3 = sc.nextDouble();

           System.out.print("Enter x4:");
           x4 = sc.nextDouble();

            System.out.print("Enter y1:");
            y1 = sc.nextDouble();

            System.out.print("Enter y2:");
             y2 = sc.nextDouble();

           System.out.print("Enter y3:");
           y3 = sc.nextDouble();

           System.out.print("Enter y4:");
           y4 = sc.nextDouble();

        }

        @Override
        public void calculateLength(){
            lineFormula=Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
            line=Math.sqrt(lineFormula);
            System.out.println("length of line:"+ line);

        }


    @Override
    public void calculateLengthTwo(){
        lineFormula2=Math.pow((x4-x3),2) + Math.pow((y4-y3),2);
        line2=Math.sqrt(lineFormula2);
        System.out.println("length of line:"+ line2);

    }


    @Override
    public void lineEqual(){
           if(Double.valueOf(line2).equals(Double.valueOf(line))){
               System.out.println("both lines are equal");
           }else{
               System.out.println("lines are not equal");
           }
    }

    @Override
    public  void lineCompare(){
            int result=Double.valueOf(line).compareTo(Double.valueOf(line2));
            if(result<0){
                System.out.println("Length of line one is smaller than length of line two ");
            }else if(result>0){
                System.out.println("Length of line one is greater than length of line two ");
            }else{
                System.out.println("both the lines are equal");
            }
    }





}
public class LineComparison extends Geometry{

    public static void main(String args[]){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        LineLength obj=new Geometry();

        obj.getData();
        obj.calculateLength();
        obj.calculateLengthTwo();


        obj.lineEqual();
        obj.lineCompare();


    }

}
