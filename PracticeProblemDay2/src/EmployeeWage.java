import java.util.Random;

class Employee{
    String name;
    int id;
    boolean attendence = false;
    int salPerHour = 20;
    double dailySalary = 0;
    int normalWorkDay = 8;

    int totalSalary = 0;
    int totalDays = 0;
    int totalHours = 0;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Use Case 1: Check Employee Present or Absent
    public void attendence(boolean a){
        if(a){
            attendence = true;
            System.out.println("Employee is present");
        } else {
            attendence = false;
            System.out.println("Employee is absent");
        }
    }

    // Use Case 2: Calculate Daily Wage
    public void calculateWage(){
        if(attendence){
            dailySalary = normalWorkDay * salPerHour;
        } else {
            dailySalary = 0;
        }

        totalSalary += dailySalary;
        totalHours += normalWorkDay;

        System.out.println("Daily Salary: " + dailySalary);
    }
}

public class EmployeeWage{
    public static void main(String args[]){

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee e1 = new Employee("Ram", 123);
        Random r = new Random();

        /*Use Case 5 & 6: Calculate wages for a month till 20 days OR 100 hours*/
        while(e1.totalDays < 20 && e1.totalHours < 100){

            e1.totalDays++;
            e1.normalWorkDay = 8;
            int i = r.nextInt(3);

            /*Use Case 3 & 4: Part Time / Full Time using Switch Case*/
            switch(i){
                case 1:
                    e1.attendence(true);
                    break;

                case 2:
                    e1.attendence(true);
                    System.out.println("Part time today");
                    e1.normalWorkDay = 4;
                    break;

                default:
                    e1.attendence(false);
                    e1.normalWorkDay = 0;
            }

            e1.calculateWage();
            System.out.println( );
        }


        System.out.println("Total Working Days: " + e1.totalDays);
        System.out.println("Total Working Hours: " + e1.totalHours);
        System.out.println("Total Monthly Salary: " + e1.totalSalary);
    }
}


