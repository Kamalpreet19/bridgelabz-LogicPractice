import java.util.Random;

abstract class Employee{

    private String name;
    private int id;
    private int salPerHour = 20;

    private int totalSalary = 0;
    private int totalDays = 0;
    private int totalHours = 0;


    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }


    public int getSalPerHour(){
        return salPerHour;
    }

    public int getTotalSalary(){
        return totalSalary;
    }

    public int getTotalHours(){
        return totalHours;
    }

    public int getTotalDays(){
        return totalDays;
    }


    abstract void calculateWage(int hours);
 
    void addWork(int hours){
        totalDays++;
        totalHours+=hours;
        totalSalary += getTotalDays()*getTotalDays();


    }


    public void showDetails(){
        System.out.println("total days: " + totalDays);
        System.out.println("total hour: " + totalHours);
        
    }
}


class WageEmployee extends Employee {

    WageEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateWage(int hours) {
        System.out.println("Worked Hours: " + hours);
        System.out.println("Daily Salary: " + (hours * getSalPerHour()));
        System.out.println("Total Salary: " + (getTotalSalary()));
    }
}


public class EmployeeWageOops{
    public static void main(String args[]){

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee e1 = new WageEmployee("Ram", 123);
        Random r = new Random();

        while(e1.getTotalDays() < 20 && e1.getTotalHours() < 100){

            int choice = r.nextInt(3);
            int hours;

            if (choice == 1) {
                System.out.println("Full Time");
                hours = 8;
            } else if (choice == 2) {
                System.out.println("Part Time");
                hours = 4;
            } else {
                System.out.println("Absent");
                hours = 0;
            }

            e1.calculateWage(hours);
            System.out.println();
        }

        e1.showDetails();
    }
}



















/*interface EmployeeRules {
    void checkAttendance(boolean present);
    void calculateDailyWage(int hours);
}
class Employee implements EmployeeRules {

    // 🔒 Encapsulation (private data)
    private String name;
    private int id;
    private int salPerHour = 20;

    private int totalSalary = 0;
    private int totalDays = 0;
    private int totalHours = 0;

    private boolean attendance = false;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public void checkAttendance(boolean present) {
        attendance = present;

        if (attendance) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

        @Override
    public void calculateDailyWage(int hours) {

        totalDays++;
        totalHours += hours;
        int dailySalary = hours * salPerHour;
        totalSalary += dailySalary;

        System.out.println("Worked Hours: " + hours);
        System.out.println("Daily Salary: " + dailySalary);
    }

        public int getTotalDays() {
        return totalDays;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public int getTotalSalary() {
        return totalSalary;
    }
}

    
